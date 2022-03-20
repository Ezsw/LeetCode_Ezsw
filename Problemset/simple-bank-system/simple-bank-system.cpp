
// @Title: 简易银行系统 (Simple Bank System)
// @Author: 17816069684
// @Date: 2022-03-18 20:13:31
// @Runtime: 220 ms
// @Memory: 114.1 MB

class Bank {
private:
    vector<long long> balance;

public:
    Bank(vector<long long>& balance) : balance(balance) {}

    bool transfer(int account1, int account2, long long money) {
        if (account1 > balance.size() || account2 > balance.size() || balance[account1 - 1] < money) {
            return false;
        }
        balance[account1 - 1] -= money;
        balance[account2 - 1] += money;
        return true;
    }

    bool deposit(int account, long long money) {
        if (account > balance.size()) {
            return false;
        }
        balance[account - 1] += money;
        return true;
    }

    bool withdraw(int account, long long money) {
        if (account > balance.size() || balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }
};
 
