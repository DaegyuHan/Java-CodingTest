package cote;


public class cote29 {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int minIndex = 0;
        // 최소 숫자 위치 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i; // 현재 원소가 최소 숫자보다 작으면 인덱스 업데이트
            }
        }

        // 결과 배열 생성, 크기는 원래 배열보다 1 작음
        int[] result = new int[arr.length - 1];

        // 인덱스 변수 초기화
        int index = 0;
        // 원래 배열을 순회하면서 최소 숫자 인덱스를 제외하고 결과 배열에 값 복사
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                result[index++] = arr[i]; // 최소 숫자가 아닌 경우 결과 배열에 추가
            }
        }
    return result;
    }

    public static void main(String[] args) {
        cote29 sol = new cote29();
        System.out.println(sol.solution(new int[]{1,2,3,4,5,6,7}));
    }
}
