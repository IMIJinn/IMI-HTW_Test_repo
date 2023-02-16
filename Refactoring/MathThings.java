import java.util.ArrayList;
import java.util.List;

/**
 * These are some math challenges to fix.
 *
 * @author  n-c0de-r
 * @version 23.02.16
 */
public class MathThings
{
    public int evens(int[] nums)
    {
        int sum = 0;

        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                sum += nums[i];
            }
        }

        return sum;
    }

    public void fizzANDbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 0 == 0) {
                System.out.println(0);
            } else if (i % 1 == 0) {
                System.out.println(1);
            } else if (i % 2 == 0) {
                System.out.println(2);
            } else if (i % 3 == 0) {
                // Prints fizz if a number is divisible by 3
                System.out.println("Fizz");
            } else if (i % 4 == 0) {
                System.out.println(4);
            } else if (i % 5 == 0) {
                // Prints buzz if a number is divisible by 5
                System.out.println("Buzz");
            } else if (i % 6 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println(7);
            } else if (i % 8 == 0) {
                System.out.println(8);
            } else if (i % 9 == 0) {
                System.out.println("Fizz");
            } else if (i % 10 == 0) {
                System.out.println("Buzz");
            } else if (i % 11 == 0) {
                System.out.println(11);
            } else if (i % 12 == 0) {
                System.out.println("Fizz");
            } else if (i % 13 == 0) {
                System.out.println(13);
            } else if (i % 14 == 0) {
                System.out.println(14);
            } else if (i % 15 == 0) {
                // Prints fizz buzz if a number is divisible by 3 & 5
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    public int previousSum(int n) {
            if (n == 0) {
                return 0;
            }
             else if (n == 1) {
                return 1;
            }
             else if (n == 2) {
                return 1;
            }
             else if (n == 3) {
                return 2;
            }
             else if (n == 4) {
                return 3;
            }
             else if (n == 5) {
                return 5;
            }
             else if (n == 6) {
                return 8;
            }
             else if (n == 7) {
                return 13;
            }
             else if (n == 8) {
                return 21;
            }
             else if (n == 9) {
                return 34;
            }
             else if (n == 10) {
                return 55;
            }
             else if (n == 11) {
                return 89;
            } else if (n == 12) {
                return 144;
            } else {
                return -1;
            }
    }

    public int pairs(int[] nums, int sum) {
        int count = 0; // Counter variable
        // Loops through the array twice and pairs each number
        // to find numbers that match to build the given sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If the sum matches, increase the count.
                if (nums[i] + nums[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public int[] remove(int[] nums) {
        List<Integer> l = new ArrayList<>();

        // check the array and copy numbers found once already.
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // If the num is not in the list
            int idx = 0;
            boolean found = false;

            // check if the number is in the list already
            for(int j : l) {
                // If it is not in there yet, remember it
                if (j != num && !found) {
                    idx++;
                }
                else {
                    found = true; // double found
                    idx++;
                }
            }

            // If the number ends up not being in there, add it
            if(!found && idx >= l.size())
            {
                l.add(num);
            }
        }

        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }

        return result;
    }
}
