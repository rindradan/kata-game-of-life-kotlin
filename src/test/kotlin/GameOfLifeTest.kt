import CellStatus.ALIVE
import CellStatus.DEAD
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class GameOfLifeTest {
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
    fun `on a grid (3,3), an alive cell on point (1,1) with 1 alive neighbor should be dead`() {
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
    fun `on a grid (3,3), an alive cell on point (1,1) with 2 alive neighbors should be alive`() {
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
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (1,1) with 3 alive neighbors should be alive`() {
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
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
        )
    }

    @Test
    fun `on a grid (3,3), an alive cell on point (1,1) with 4 alive neighbors should be dead`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
        )
        val game = GameOfLife(initialGrid = grid)
        // WHEN
        val nextGrid = game.generateNextGrid()
        // THEN
        nextGrid shouldBe arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(DEAD), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
        )
    }
}
