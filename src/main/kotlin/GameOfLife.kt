import CellStatus.DEAD

class GameOfLife(cell: Cell, neighborsCount: Int) {
    fun nextGeneration(): Cell = Cell(DEAD)
}
