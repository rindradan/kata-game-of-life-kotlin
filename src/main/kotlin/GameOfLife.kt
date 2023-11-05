import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(private val cell: Cell, private val aliveNeighborsCount: Int) {
    fun nextGeneration(): Cell =
        when {
            cell.status == ALIVE && aliveNeighborsCount == 2 -> Cell(ALIVE)
            cell.status == ALIVE && aliveNeighborsCount == 3 -> Cell(ALIVE)
            else -> Cell(DEAD)
        }
}
