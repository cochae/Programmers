import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public String solution(int[] numbers) {
        // 정수 배열을 문자열 배열로 변환
        String[] strNumbers = Arrays.stream(numbers)
                                     .mapToObj(String::valueOf)
                                     .toArray(String[]::new);

        // 커스텀 정렬: 두 수를 비교하여 어떤 조합이 더 큰지 결정
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b); // b + a가 a + b보다 크면 b가 앞에 와야 함
            }
        });

        // 정렬된 문자열 배열을 이어 붙여서 결과 생성
        StringBuilder result = new StringBuilder();
        for (String num : strNumbers) {
            result.append(num);
        }

        // 결과가 "0"일 경우 예외 처리
        return result.charAt(0) == '0' ? "0" : result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 배열 형태로 입력하세요 (예: [6, 10, 2]):");

        // 사용자 입력 받기
        String input = scanner.nextLine();
        
        // 입력받은 문자열에서 대괄호 제거 및 공백 제거
        input = input.replaceAll("[\\[\\] ]", "");
        String[] inputNumbers = input.split(","); // 쉼표로 분리
        int[] numbers = new int[inputNumbers.length];

        // 입력된 문자열을 정수로 변환
        try {
            for (int i = 0; i < inputNumbers.length; i++) {
                numbers[i] = Integer.parseInt(inputNumbers[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("유효한 정수를 입력하세요.");
            return;
        }

        // Solution 객체 생성 및 결과 출력
        Solution sol = new Solution();
        String result = sol.solution(numbers);
        System.out.println("\"" + result + "\"");
    }
}
