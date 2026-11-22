#pragma once

namespace melonDS
{
class ThreadLifecycleScope
{
public:
    using Callback = void (*)(bool);

    explicit ThreadLifecycleScope(Callback callback) : callback(callback)
    {
        if (callback) callback(true);
    }

    ~ThreadLifecycleScope()
    {
        if (callback) callback(false);
    }

    ThreadLifecycleScope(const ThreadLifecycleScope&) = delete;
    ThreadLifecycleScope& operator=(const ThreadLifecycleScope&) = delete;

private:
    Callback callback;
};
}
