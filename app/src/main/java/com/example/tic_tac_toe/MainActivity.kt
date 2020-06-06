package com.example.tic_tac_toe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bClick(view: View) {
        val bSelected = view as Button
        var cellId = 0
        when (bSelected.id) {
            R.id.b00 -> cellId = 1
            R.id.b01 -> cellId = 2
            R.id.b02 -> cellId = 3
            R.id.b10 -> cellId = 4
            R.id.b11 -> cellId = 5
            R.id.b12 -> cellId = 6
            R.id.b20 -> cellId = 7
            R.id.b21 -> cellId = 8
            R.id.b22 -> cellId = 9
        }
        playGame(cellId, bSelected)
    }

    var player1 = ArrayList<Int>()
    var computer = ArrayList<Int>()
    var activePlayer = "player"

    private fun playGame(cellId: Int, bSelected: Button) {
        var bDeactivate: Button
        if (activePlayer == "player") {
            bSelected.text = "X"
            bSelected.setBackgroundColor(Color.CYAN)
            player1.add(cellId)
            activePlayer = "computer"
            if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false


            } else if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
                Toast.makeText(applicationContext, "Congratulations! You won", Toast.LENGTH_LONG)
                    .show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if ((player1.size + computer.size) == 9) {
                Toast.makeText(applicationContext, "Game tied!", Toast.LENGTH_LONG).show()
            }
        }
        if (activePlayer == "computer") {
            autoPlay()
            if (computer.contains(1) && computer.contains(2) && computer.contains(3)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(4) && computer.contains(5) && computer.contains(6)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(7) && computer.contains(8) && computer.contains(9)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(1) && computer.contains(4) && computer.contains(7)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(2) && computer.contains(5) && computer.contains(8)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(3) && computer.contains(6) && computer.contains(9)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(1) && computer.contains(5) && computer.contains(9)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if (computer.contains(3) && computer.contains(5) && computer.contains(7)) {
                Toast.makeText(
                    applicationContext,
                    "Computer won! Better luck next time.",
                    Toast.LENGTH_LONG
                ).show()
                bDeactivate = b00
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b01
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b02
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b10
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b11
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b12
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b20
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b21
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
                bDeactivate = b22
                bDeactivate.isEnabled = false
                bDeactivate.isClickable = false
            } else if ((player1.size + computer.size) == 9) {
                Toast.makeText(applicationContext, "Game tied!", Toast.LENGTH_LONG).show()

            }
        }
    }
    private fun autoPlay(){
        val bSelected:Button
        val cellId:Int
        if(player1.contains(1) && player1.contains(2) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"

        }
        else if(player1.contains(1) && player1.contains(3) && !player1.contains(2) && !computer.contains(3)){
            bSelected=b01
            bSelected.text="O"
            cellId=2
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"

        }
        else if(player1.contains(2) && player1.contains(3) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(1) && player1.contains(4) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(4) && player1.contains(7) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(1) && player1.contains(7) && !player1.contains(4) && !computer.contains(4)){
            bSelected=b10
            bSelected.text="O"
            cellId=4
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(4) && player1.contains(5) && !player1.contains(6) && !computer.contains(6)){
            bSelected=b12
            bSelected.text="O"
            cellId=6
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(4) && player1.contains(6) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(5) && player1.contains(6) && !player1.contains(4) && !computer.contains(4)){
            bSelected=b10
            bSelected.text="O"
            cellId=4
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(7) && player1.contains(8) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(8) && player1.contains(9) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(7) && player1.contains(9) && !player1.contains(8) && !computer.contains(8)){
            bSelected=b21
            bSelected.text="O"
            cellId=8
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(2) && player1.contains(5) && !player1.contains(8) && !computer.contains(8)){
            bSelected=b21
            bSelected.text="O"
            cellId=8
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(5) && player1.contains(8) && !player1.contains(2) && !computer.contains(2)){
            bSelected=b01
            bSelected.text="O"
            cellId=2
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(2) && player1.contains(8) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(3) && player1.contains(6) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(3) && player1.contains(9) && !player1.contains(6) && !computer.contains(6)){
            bSelected=b12
            bSelected.text="O"
            cellId=6
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(6) && player1.contains(9) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(1) && player1.contains(5) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(1) && player1.contains(9) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(5) && player1.contains(9) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(3) && player1.contains(5) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(3) && player1.contains(7) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(player1.contains(5) && player1.contains(7) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(1) && computer.contains(2) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"

        }
        else if(computer.contains(1) && computer.contains(3) && !player1.contains(2) && !computer.contains(3)){
            bSelected=b01
            bSelected.text="O"
            cellId=2
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"

        }
        else if(computer.contains(2) && computer.contains(3) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(1) && computer.contains(4) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(4) && computer.contains(7) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(1) && computer.contains(7) && !player1.contains(4) && !computer.contains(4)){
            bSelected=b10
            bSelected.text="O"
            cellId=4
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(4) && computer.contains(5) && !player1.contains(6) && !computer.contains(6)){
            bSelected=b12
            bSelected.text="O"
            cellId=6
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(4) && computer.contains(6) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(5) && computer.contains(6) && !player1.contains(4) && !computer.contains(4)){
            bSelected=b10
            bSelected.text="O"
            cellId=4
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(7) && computer.contains(8) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(8) && computer.contains(9) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(7) && computer.contains(9) && !player1.contains(8) && !computer.contains(8)){
            bSelected=b21
            bSelected.text="O"
            cellId=8
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(2) && computer.contains(5) && !player1.contains(8) && !computer.contains(8)){
            bSelected=b21
            bSelected.text="O"
            cellId=8
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(5) && computer.contains(8) && !player1.contains(2) && !computer.contains(2)){
            bSelected=b01
            bSelected.text="O"
            cellId=2
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(2) && computer.contains(8) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(3) && computer.contains(6) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(3) && computer.contains(9) && !player1.contains(6) && !computer.contains(6)){
            bSelected=b12
            bSelected.text="O"
            cellId=6
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(6) && computer.contains(9) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(1) && computer.contains(5) && !player1.contains(9) && !computer.contains(9)){
            bSelected=b22
            bSelected.text="O"
            cellId=9
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(1) && computer.contains(9) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(5) && computer.contains(9) && !player1.contains(1) && !computer.contains(1)){
            bSelected=b00
            bSelected.text="O"
            cellId=1
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(3) && computer.contains(5) && !player1.contains(7) && !computer.contains(7)){
            bSelected=b20
            bSelected.text="O"
            cellId=7
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(3) && computer.contains(7) && !player1.contains(5) && !computer.contains(5)){
            bSelected=b11
            bSelected.text="O"
            cellId=5
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }
        else if(computer.contains(5) && computer.contains(7) && !player1.contains(3) && !computer.contains(3)){
            bSelected=b02
            bSelected.text="O"
            cellId=3
            bSelected.setBackgroundColor(Color.MAGENTA)
            computer.add(cellId)
            activePlayer="player"
        }

        else{
            var cellId:Int
            var bSelected:Button
            var index = listOf<Int>(1,2,3,4,5,6,7,8,9)
            var randomvalues=index.shuffled()
            var i=0
            cellId=randomvalues[i]
            bSelected=b00
            while(player1.contains(cellId) || computer.contains(cellId)){
                i+=1
                cellId=randomvalues[i]
            }
            if(i<=8){
                when(cellId){
                    1->bSelected=b00
                    2->bSelected=b01
                    3->bSelected=b02
                    4->bSelected=b10
                    5->bSelected=b11
                    6->bSelected=b12
                    7->bSelected=b20
                    8->bSelected=b21
                    9->bSelected=b22
                }
                bSelected.text="O"
                bSelected.setBackgroundColor(Color.MAGENTA)
                computer.add(cellId)
                activePlayer="player"

            }


        }
    }
    fun reset(view: View) {
        player1 = ArrayList<Int>()
        computer = ArrayList<Int>()
        activePlayer="player"
        var bSelected:Button = b00
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b01
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b02
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b10
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b11
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b12
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b20
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b21
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
        bSelected=b22
        bSelected.text=""
        bSelected.setBackgroundColor(Color.WHITE)
        bSelected.isClickable = true
        bSelected.isEnabled = true
    }
}

