class Solution {
  public:
    vector<int> getMinMax(vector<int> &arr) {
        // code here
        vector<int>v;
        int min=INT_MAX;
        int max=INT_MIN;
        for(int i=0;i<arr.size();i++)
        {
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
            
        }
            v.push_back(min);
            v.push_back(max);
        return v;
    }
};