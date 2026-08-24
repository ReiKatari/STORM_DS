package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di4  reason: default package */
/* loaded from: classes.dex */
public final class di4 {
    public final java.util.concurrent.locks.ReentrantLock a;
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public final java.util.concurrent.locks.ReentrantLock e;
    public volatile boolean f;

    public di4(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.a = r0
            long[] r0 = new long[r2]
            r1.b = r0
            boolean[] r2 = new boolean[r2]
            r1.c = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.e = r2
            return
    }
}
