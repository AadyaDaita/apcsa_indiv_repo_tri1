package _notebooks;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics2D;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

public class Pics {
    private final String inDir = "images/"; // location of images
    private final String outDir = "images/tmp/";  // location of created files
    private final String greyDir = "images/tmp/greyscale/";
    private final String redDir = "images/tmp/red/";
    private final String blueDir = "images/tmp/blue/";
    private final String greenDir = "images/tmp/green/";
    private String inFile;
    private String resizedFile;
    private String redFile; private String greenFile; private String blueFile;
    private String greyscaleFile;
    private String asciiFile;
    private String ext;   // extension of file
    private long bytes;
    private int width;
    private int height;

    // Constructor obtains attributes of picture
    public Pics(String name, String ext) {
        this.ext = ext;
        this.inFile = this.inDir + name + "." + ext;
        this.resizedFile = this.outDir + name + "." + ext;
        this.greyscaleFile = this.greyDir + name + "_grey" + "." + ext;
        this.redFile = this.redDir + name + "_red" + "." + ext;
        this.blueFile = this.blueDir + name + "_blue" + "." + ext;
        this.greenFile = this.greenDir + name + "_green" + "." + ext;
        this.asciiFile = this.outDir + name + ".txt";
        this.setStats();
    }

    
    // An image contains metadata, namely size, width, and height
    public void setStats() {
        BufferedImage img;
        try {
            Path path = Paths.get(this.inFile);
            this.bytes = Files.size(path);
            img = ImageIO.read(new File(this.inFile));
            this.width = img.getWidth();
            this.height = img.getHeight();
        } catch (IOException e) {
        }
    }

    // Console print of data
    public void printStats(String msg) {
        System.out.println(msg + ": " + this.bytes + " " + this.width + "x" + this.height + "  " + this.inFile);
    }

    // Convert scaled image into buffered image
    public static BufferedImage convertToBufferedImage(Image img) {

        // Create a buffered image with transparency
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);

        // magic?
        Graphics2D graphics2D = bi.createGraphics();
        graphics2D.drawImage(img, 0, 0, null);
        graphics2D.dispose();

        return bi;
    }
    
    // Scale or reduce to "scale" percentage provided
    public void resize(int scale) {
        BufferedImage img = null;
        Image resizedImg = null;  

        int width = (int) (this.width * (scale/100.0) + 0.5);
        int height = (int) (this.height * (scale/100.0) + 0.5);

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            // create a new BufferedImage for drawing
            resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            return;
        }

        try {
            ImageIO.write(convertToBufferedImage(resizedImg), this.ext, new File(resizedFile));
        } catch (IOException e) {
            return;
        }
        
        this.inFile = this.resizedFile;  // use scaled file vs original file in Class
        this.setStats();
    }

    public void greyscale() {
        BufferedImage img = null;
        BufferedImage greyImg = null;  

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            greyImg = img;
            // create a new BufferedImage for drawing
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    Color co = new Color(img.getRGB(j, i));
                    int red = (int) (co.getRed() * 0.299);
                    int green = (int) (co.getGreen() * 0.587);
                    int blue = (int) (co.getBlue() * 0.114);
                    int total = red + green + blue;
                    Color newColor = new Color(
                        total, total, total
                    );
                    greyImg.setRGB(j, i, newColor.getRGB());
                }
            }

        } catch (IOException e) {
            return;
        }

        try {
            ImageIO.write(convertToBufferedImage(greyImg), this.ext, new File(greyscaleFile));
        } catch (IOException e) {
            return;
        }
        
        this.inFile = this.greyscaleFile;  // use scaled file vs original file in Class
        this.setStats();
    }
    
    public void redscale() {
        BufferedImage img = null;
        BufferedImage redImg = null;  

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            redImg = img;
            // create a new BufferedImage for drawing
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    Color co = new Color(img.getRGB(j, i));
                    int red = (int) co.getRed();
                    int green = 0;
                    int blue = 0;
                    Color newColor = new Color(
                            red,
                            green,
                            blue);
                    redImg.setRGB(j, i, newColor.getRGB());
                }
            }

        } catch (IOException e) {
            return;
        }

        try {
            ImageIO.write(convertToBufferedImage(redImg), this.ext, new File(redFile));
        } catch (IOException e) {
            return;
        }
        
        this.inFile = this.redFile;  // use scaled file vs original file in Class
        this.setStats();
    }

    public void greenscale() {
        BufferedImage img = null;
        BufferedImage greenImg = null;  

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            greenImg = img;
            // create a new BufferedImage for drawing
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    Color co = new Color(img.getRGB(j, i));
                    int red = 0;
                    int green = (int) co.getGreen();
                    int blue = 0;
                    Color newColor = new Color(
                            red,
                            green,
                            blue);
                    greenImg.setRGB(j, i, newColor.getRGB());
                }
            }

        } catch (IOException e) {
            return;
        }

        try {
            ImageIO.write(convertToBufferedImage(greenImg), this.ext, new File(greenFile));
        } catch (IOException e) {
            return;
        }
        
        this.inFile = this.greenFile;  // use scaled file vs original file in Class
        this.setStats();
    }

    public void bluescale() {
        BufferedImage img = null;
        BufferedImage blueImg = null;  

        try {
            // read an image to BufferedImage for processing
            img = ImageIO.read(new File(this.inFile));  // set buffer of image data
            blueImg = img;
            // create a new BufferedImage for drawing
            for (int i = 0; i < img.getHeight(); i++) {
                for (int j = 0; j < img.getWidth(); j++) {
                    Color co = new Color(img.getRGB(j, i));
                    int red = (int) (co.getRed() * 0.299);
                    int green = (int) (co.getGreen() * 0.587);
                    int blue = (int) (co.getBlue() * 0.114);
                    int total = red + green + blue;
                    Color newColor = new Color(0, 0, total);
                    blueImg.setRGB(j, i, newColor.getRGB());
                }
            }

        } catch (IOException e) {
            return;
        }

        try {
            ImageIO.write(convertToBufferedImage(blueImg), this.ext, new File(blueFile));
        } catch (IOException e) {
            return;
        }
        
        this.inFile = this.blueFile;  // use scaled file vs original file in Class
        this.setStats();
    }

    // convert every pixel to an ascii character (ratio does not seem correct)
    public void convertToAscii() {
        BufferedImage img = null;
        PrintWriter asciiPrt = null;
        FileWriter asciiWrt = null;

        try {
            File file = new File(this.asciiFile);
            Files.deleteIfExists(file.toPath()); 
        } catch (IOException e) {
            System.out.println("Delete File error: " + e);
        }

        try {
            asciiPrt = new PrintWriter(asciiWrt = new FileWriter(this.asciiFile, true));
        } catch (IOException e) {
            System.out.println("ASCII out file create error: " + e);
        }

        try {
            img = ImageIO.read(new File(this.inFile));
        } catch (IOException e) {
        }

        for (int i = 0; i < img.getHeight(); i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < img.getWidth(); j++) {
                    Color col = new Color(img.getRGB(j, i));
                    double pixVal = (((col.getRed() * 0.30) + (col.getBlue() * 0.59) + (col
                            .getGreen() * 0.11)));
                    try {
                        asciiPrt.print(asciiChar(pixVal));
                        asciiPrt.print(asciiChar(pixVal));
                        asciiPrt.flush();
                        asciiWrt.flush();
                    } catch (Exception ex) {
                    }
                }
                try {
                    asciiPrt.println("");
                    asciiPrt.flush();
                    asciiWrt.flush();
                } catch (Exception ex) {
                }
            }
        }   
    }

    // conversion table, there may be better out there ie https://www.billmongan.com/Ursinus-CS173-Fall2020/Labs/ASCIIArt
    public String asciiChar(double g) {
        String str = " ";
        if (g >= 240) {
            str = " ";
        } else if (g >= 210) {
            str = ".";
        } else if (g >= 190) {
            str = "*";
        } else if (g >= 170) {
            str = "+";
        } else if (g >= 120) {
            str = "^";
        } else if (g >= 110) {
            str = "&";
        } else if (g >= 80) {
            str = "8";
        } else if (g >= 60) {
            str = "#";
        } else {
            str = "@";
        }
        return str;
    }

    // tester/driver
    public static void main(String[] args) throws IOException {
        Pics MonaLisa = new Pics("MonaLisa", "png");
        MonaLisa.greyscale();
        MonaLisa.redscale();
        MonaLisa.greenscale();
        MonaLisa.bluescale();
        MonaLisa.printStats("Original");
        MonaLisa.resize(33);
        MonaLisa.printStats("Scaled");
        MonaLisa.convertToAscii();
    }
}