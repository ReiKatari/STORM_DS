package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s60  reason: default package */
/* loaded from: classes.dex */
public abstract class s60 {
    public static final yj0 a = new yj0(-1, null, null, 0);
    public static final int b = nl2.Y(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = nl2.Y(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final an1 d = new an1("BUFFERED", 9);
    public static final an1 e = new an1("SHOULD_BUFFER", 9);
    public static final an1 f = new an1("S_RESUMING_BY_RCV", 9);
    public static final an1 g = new an1("RESUMING_BY_EB", 9);
    public static final an1 h = new an1("POISONED", 9);
    public static final an1 i = new an1("DONE_RCV", 9);
    public static final an1 j = new an1("INTERRUPTED_SEND", 9);
    public static final an1 k = new an1("INTERRUPTED_RCV", 9);
    public static final an1 l = new an1("CHANNEL_CLOSED", 9);
    public static final an1 m = new an1("SUSPEND", 9);
    public static final an1 n = new an1("SUSPEND_NO_WAITER", 9);
    public static final an1 o = new an1("FAILED", 9);
    public static final an1 p = new an1("NO_RECEIVE_RESULT", 9);
    public static final an1 q = new an1("CLOSE_HANDLER_CLOSED", 9);
    public static final an1 r = new an1("CLOSE_HANDLER_INVOKED", 9);
    public static final an1 s = new an1("NO_CLOSE_CAUSE", 9);

    public static final boolean a(hh0 hh0Var, Object obj, bj2 bj2Var) {
        an1 m2 = hh0Var.m(obj, bj2Var);
        if (m2 != null) {
            hh0Var.s(m2);
            return true;
        }
        return false;
    }
}
