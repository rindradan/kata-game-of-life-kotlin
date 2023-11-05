import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(private val cell: Cell, private val aliveNeighborsCount: Int) {
    fun nextGeneration(): Cell? =
        when {
            cell.status == ALIVE && aliveNeighborsCount == 0 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 1 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 2 -> Cell(ALIVE)
            cell.status == ALIVE && aliveNeighborsCount == 3 -> Cell(ALIVE)
            cell.status == ALIVE && aliveNeighborsCount == 4 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 5 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 6 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 7 -> Cell(DEAD)
            cell.status == ALIVE && aliveNeighborsCount == 8 -> Cell(DEAD)
            cell.status == DEAD && aliveNeighborsCount == 3 -> Cell(ALIVE)
            else -> null
        }
}
