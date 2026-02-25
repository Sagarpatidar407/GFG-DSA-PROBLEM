// User function Template for C++
class Solution {
  public:
    vector<int> getTable(int n) {
        // Write Your Code here
        int pr=1;
        vector<int>p;
        for(int i=1;i<=10;i++)
        {
            pr=i*n;
            p.push_back(pr);
        }
        return p;
    }
};