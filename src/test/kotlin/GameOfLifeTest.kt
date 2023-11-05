import CellStatus.ALIVE
import CellStatus.DEAD
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class GameOfLifeTest {
    @Test
    fun `a cell with no neighbors should be dead by solitude`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 0)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 1 alive neighbor should be dead by underpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 1)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 2 alive neighbors should be alive`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 2)
        // THEN
        nextCell shouldBe Cell(ALIVE)
    }

    @Test
    fun `a cell with 3 alive neighbors should be alive`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 3)
        // THEN
        nextCell shouldBe Cell(ALIVE)
    }

    @Test
    fun `a cell with 4 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 4)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 5 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 5)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 6 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 6)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 7 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 7)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a cell with 8 alive neighbors should be dead by overpopulation`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 8)
        // THEN
        nextCell shouldBe Cell(DEAD)
    }

    @Test
    fun `a dead cell with 3 alive neighbors should be alive`() {
        // GIVEN
        val cell = Cell(DEAD)
        val game = GameOfLife(initialGrid = emptyArray())
        // WHEN
        val nextCell = game.generateNextCell(cell, 3)
        // THEN
        nextCell shouldBe Cell(ALIVE)
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (1,1) with no neighbors should be dead`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (1,1) with one neighbor should be dead`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (1,1) with 2 neighbors should be alive`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    @Disabled("irrelevant for the moment")
    fun `on a grid (3,3), an alive cell on point (1,1) with 3 neighbors should be alive`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (0,1) with 0 neighbors should be dead`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (0,1) with 1 neighbor should be dead`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    @Disabled("irrelevant for the moment")
    fun `on a grid (3,3), an alive cell on point (0,1) with 2 neighbor should be alive`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }
}
