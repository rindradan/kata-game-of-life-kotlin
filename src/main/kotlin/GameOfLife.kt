import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(private val cell: Cell, private val aliveNeighborsCount: Int) {
    fun nextGeneration(): Cell = if (cell.status == ALIVE && aliveNeighborsCount == 2) Cell(ALIVE) else Cell(DEAD)
}
