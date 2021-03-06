/** a position of elements in the game */
public class CartPt {
	int x; // number of cells, from left
	int y; // number of cells, from upward

	CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	// to move this point one step towards the given direction
	public CartPt move(IDirection direction) {
		return new CartPt(this.x + direction.deltaX(),
							this.y + direction.deltaY());
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartPt other = (CartPt) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


}
