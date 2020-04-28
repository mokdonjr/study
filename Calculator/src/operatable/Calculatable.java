package operatable;

/**
 * 계산기 인터페이스
 */
public interface Calculatable {
	
	/**
	 * 계산 결과를 반환
	 * @param value
	 * @param arg
	 * @return
	 */
	int operate(int value, int arg);
}
