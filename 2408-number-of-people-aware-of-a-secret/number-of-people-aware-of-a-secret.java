class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        
        // people[i]: number of people who learned the secret exactly i days ago
        long[] people = new long[forget];
        people[0] = 1;  // On day 1, 1 person knows the secret

        for (int day = 1; day < n; day++) {
            long newPeople = 0;
            // Sum people who are eligible to share the secret today
            for (int i = delay - 1; i < forget - 1; i++) {
                newPeople = (newPeople + people[i]) % MOD;
            }
            
            // Shift people by 1 day (aging)
            for (int i = forget - 1; i > 0; i--) {
                people[i] = people[i - 1];
            }
            people[0] = newPeople;
        }
        
        // Sum up the number of people who still know the secret
        long total = 0;
        for (long count : people) {
            total = (total + count) % MOD;
        }
        
        return (int) total;
    }
}
