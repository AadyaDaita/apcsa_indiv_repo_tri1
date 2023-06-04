---
toc: true
layout: post
categories: [markdown]
title: JavaScript Exit Ticket Tic Tac Toe
---

<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Tic Tac Toe</title>
    <style>
        td {
            width: 100px;
            height: 100px;
        }
        table {
            margin: 18px auto;
        }
        .column {
            border-left: 2.5px solid #000000;
            border-right: 2.5px solid #000000;
        }
        .row {
            border-top: 2.5px solid #000000;
            border-bottom: 2.5px solid #000000;
        }
        .text {
            text-align: center;
            font-size: 75px;
            font-family: sans-serif;
            color: #C6AEB8;
        }
        .again {
            background: #F5CDDE;
            padding: 15px 100px;
            text-align: center;
            font-size: 20px;
            margin: 4px 2px;
            cursor: pointer;
            width: 50%;
            font-family: 'Times New Roman';
        }
    </style>
    <script>
        //TIC TAC TOE BOARD CREATED
        //The list board is created
        const board = [
            ["", "", ""],
            ["", "", ""],
            ["", "", ""]
        ]
        // each element is assigned an html ID. so, when the list is updated, the html will print the value in the list.
            window.onload = function () {
                document.getElementById('box00').innerHTML = board[0][0];
                document.getElementById('box01').innerHTML = board[0][1];
                document.getElementById('box02').innerHTML = board[0][2];
                document.getElementById('box10').innerHTML = board[1][0];
                document.getElementById('box11').innerHTML = board[1][1];
                document.getElementById('box12').innerHTML = board[1][2];
                document.getElementById('box20').innerHTML = board[2][0];
                document.getElementById('box21').innerHTML = board[2][1];
                document.getElementById('box22').innerHTML = board[2][2];
            };
        //main procedure that is used in 3C. It is called user_clicked.
        //The user clicking on a location on the game grid invokes the procedure.
        var is_user_turn = true;
        function user_clicked(row, column) {
            if (is_user_turn) {
                if (is_empty(row, column)) {
                    //checking is the list element is empty
                    board[row][column] = "O"
                    document.getElementById('box' + row + column).innerHTML = board[row][column];
    /* In my game_done function, if rnd is equal to 0, then game_done checks
        whether
        there are any matches row-wise. If rnd is equal to 1, then game_done checks if
        there are any matches column wise. Lastly, if rnd is 3 and 4, game_done checks
        for matches left and right diagonally, respectively. So, in the user_clicked
        function,
        it initialized rnd to 0, and then iterates until 4, checking whether or not the
        game is done. */
        let rnd = 0;
                        while (rnd < 4) {
                            if (game_done(rnd++)) {
                                //console.log("you won")
                                document.getElementById('status').innerHTML = "YOU WON!!!";
                                return
                            }
                        }
                        is_user_turn = false
                        delay(100).then(() => computer_play())
                    }
                    else {
                        document.getElementById('status').innerHTML = "Error: please click on an empty space"
                        delay(3000).then(() => location.reload())
                    }
                }
            }
            // is a particular space empty?
            function is_empty(row1, column1) {
                if (board[row1][column1] === "") {
                    return true
                }
                return false
            }
            function computer_play() {
                if (!is_user_turn && !board_full()) {
                    let row_rand = Math.floor(Math.random() * 3);
                    let column_rand = Math.floor(Math.random() * 3);
                    // randomizing where the computer will place an "X".
                    while (!is_empty(row_rand, column_rand)) {
                        row_rand = Math.floor(Math.random() * 3);
                        column_rand = Math.floor(Math.random() * 3);
                    }
                    board[row_rand][column_rand] = "X"
                    document.getElementById('box' + row_rand + column_rand).innerHTML =
                        board[row_rand][column_rand];
                    let rnd = 0;
                    // checking if the game is done (look at comment above for gam_done explanation)
                    while (rnd < 4) {
                        if (game_done(rnd++)) {
//console.log("computer won")
                    document.getElementById('status').innerHTML = "YOU LOST";
                    return
                }
            }
        }
        // what do to for a tie
        if (board_full()) {
            document.getElementById('status').innerHTML = "TIE";
        }
        is_user_turn = true
    }
    // are all the list elements of bord full?
    function board_full() {
        for (let row = 0; row < 3; row++) {
            for (let column = 0; column < 3; column++) {
                if (board[row][column] === "") {
                    return false
                }
            }
        }
        return true
    }
    function delay(time) {
        return new Promise(resolve => setTimeout(resolve, time));
    }
    function game_done(rnd) {
        //for sideways checking
        if (rnd == 0) {
            for (column = 0; column < 3; column++) {
                if (board[0][column] == "O" && board[1][column] == "O" && board[2][column] == "O") {
                    return true
                }
                if (board[0][column] == "X" && board[1][column] == "X" && board[2][column] == "X") {
                    return true
                }
            }
            }
                    else if (rnd == 1) {
                        // for downward checking
                        for (row = 0; row < 3; row++) {
                            if (board[row][0] == "O" && board[row][1] == "O" && board[row][2] == "O") {
                                return true
                            }
                            if (board[row][0] == "X" && board[row][1] == "X" & board[row][2] == "X") {
                                return true
                            }
                        }
                    }
                    else if (rnd == 2) {
                        //checking left diagonally
                        if (board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") {
                            return true
                        }
                        if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") {
                            return true
                        }
                    }
                    else if (rnd == 3) {
                        // checking right diagonally
                        if (board[0][2] == "O" && board[1][1] == "O" && board[2][0] == "O") {
                            return true
                        }
                        if (board[0][2] == "X" && board[1][1] == "X" && board[2][0] == "X") {
                            return true
                        }
                    }
                    return false
                }
            </script>
  
</head>
<body style="background-color:#FAF9F6 ;">
<br>
<br>

<center><h1>Tic Tac Toe</h1></center>
  <h1 class="text-center m-5">Hours</h1>
  <div style="color:red;" class="text-center m-5 timer">00:00:00</div>
  <div class="button-container">
    <center> <button class="button" onclick="startTimer()">Start</button></center>
    <br>
    <center><button class="button" onclick="stopTimer()">Stop</button></center>
    <br>
    <center><button class="button" onclick="resetTimer()">Reset</button></center>
  </div>



<br>
<table>
    <tr>
        <td class="text" id="box00" onclick="user_clicked(0,0)"></td>
        <td class="column text" id="box01" onclick="user_clicked(0,1)"></td>
        <td class="text" id="box02" onclick="user_clicked(0,2)"></td>
    </tr>
    <tr>
        <td id="box10" class="row text" onclick="user_clicked(1,0)"></td>
        <td id="box11" class="column row text" onclick="user_clicked(1,1)"></td>
        <td id="box12" class="row text" onclick="user_clicked(1,2)"></td>
    </tr>
    <tr>
        <td id="box20" class="text" onclick="user_clicked(2,0)"></td>
        <td id="box21" class="column text" onclick="user_clicked(2,1)"></td>
        <td id="box22" class="text" onclick="user_clicked(2,2)"></td>
    </tr>
</table>
<br>
<br>
<center>
    <h1>
        <div id="status"></div>
    </h1>
</center>
<br>
<center><button class="again" onclick="location.reload()">Play Again!</button></center>
</body>

</html>
