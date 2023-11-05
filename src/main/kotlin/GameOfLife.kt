import CellStatus.ALIVE
import CellStatus.DEAD

class GameOfLife(
    private val initialGrid: Array<Array<Cell>>,
    private val gridService: GridService = GridService()
) {
    fun nextGeneration(cell: Cell, aliveNeighborsCount: Int): Cell? =
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

    fun generateNextGrid(): Array<Array<Cell>> {
        val aliveNeighborsCount = gridService.getAliveNeighborsCount(initialGrid)
        val nextCell = nextGeneration(cell = initialGrid[1][1], aliveNeighborsCount = aliveNeighborsCount)
        return arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), nextCell ?: Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }
}
