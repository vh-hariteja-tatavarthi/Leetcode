class Solution {
    public int amountOfTime(TreeNode root, int start) {
        // Step 1: Build graph (adjacency list)
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                map.computeIfAbsent(curr.val, k -> new ArrayList<>()).add(curr.left.val);
                map.computeIfAbsent(curr.left.val, k -> new ArrayList<>()).add(curr.val);
                q.add(curr.left);
            }
            if (curr.right != null) {
                map.computeIfAbsent(curr.val, k -> new ArrayList<>()).add(curr.right.val);
                map.computeIfAbsent(curr.right.val, k -> new ArrayList<>()).add(curr.val);
                q.add(curr.right);
            }
        }

        // Step 2: BFS infection spread
        Queue<int[]> infect = new LinkedList<>(); // {node, time}
        Set<Integer> visited = new HashSet<>();
        infect.add(new int[]{start, 0});
        visited.add(start);

        int time = 0;

        while (!infect.isEmpty()) {
            int[] curr = infect.poll();
            int node = curr[0], t = curr[1];
            time = Math.max(time, t);

            for (int nei : map.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    infect.add(new int[]{nei, t + 1});
                }
            }
        }

        return time;
    }
}
