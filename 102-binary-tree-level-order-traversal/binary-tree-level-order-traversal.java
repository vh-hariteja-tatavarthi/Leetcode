class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, ArrayList<Integer>> mapper = new HashMap<>();
        Queue<TreeNode> node = new LinkedList<>();
        if (root == null) return new ArrayList<>();
        node.add(root);
        
        int level = 0;
        while (!node.isEmpty()) {
            int size = node.size();
            mapper.put(level, new ArrayList<>());
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = node.poll();
                if (curr != null) {
                    mapper.get(level).add(curr.val);
                    if (curr.left != null) node.add(curr.left);
                    if (curr.right != null) node.add(curr.right);
                }
            }
            level++;
        }
        
        return new ArrayList<>(mapper.values());
    }
}
