

public class Bocal extends Thread {
	
	private String _type;
	private int _index;
	
	public Bocal(String type, int index) {
		_type = type;
		_index = index;
	}
	
	@Override
	public void run() {
		
		System.out.println("Commence : " + _index + _type);

				
	}
	
	public synchronized String get_type() {
		return _type;
	}
	public synchronized void set_type(String _type) {
		this._type = _type;
	}
	public synchronized int get_index() {
		return _index;
	}
	public synchronized void set_index(int _index) {
		this._index = _index;
	}
}
