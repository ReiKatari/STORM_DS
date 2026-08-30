package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j94  reason: default package */
/* loaded from: classes.dex */
public final class j94 {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public j94(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
