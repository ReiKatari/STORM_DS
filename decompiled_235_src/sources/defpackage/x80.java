package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x80  reason: default package */
/* loaded from: classes.dex */
public abstract class x80 {
    public static final hm0 a = new hm0(-1, null, null, 0);
    public static final int b = bl2.V(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = bl2.V(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final gr1 d = new gr1("BUFFERED", 9);
    public static final gr1 e = new gr1("SHOULD_BUFFER", 9);
    public static final gr1 f = new gr1("S_RESUMING_BY_RCV", 9);
    public static final gr1 g = new gr1("RESUMING_BY_EB", 9);
    public static final gr1 h = new gr1("POISONED", 9);
    public static final gr1 i = new gr1("DONE_RCV", 9);
    public static final gr1 j = new gr1("INTERRUPTED_SEND", 9);
    public static final gr1 k = new gr1("INTERRUPTED_RCV", 9);
    public static final gr1 l = new gr1("CHANNEL_CLOSED", 9);
    public static final gr1 m = new gr1("SUSPEND", 9);
    public static final gr1 n = new gr1("SUSPEND_NO_WAITER", 9);
    public static final gr1 o = new gr1("FAILED", 9);
    public static final gr1 p = new gr1("NO_RECEIVE_RESULT", 9);
    public static final gr1 q = new gr1("CLOSE_HANDLER_CLOSED", 9);
    public static final gr1 r = new gr1("CLOSE_HANDLER_INVOKED", 9);
    public static final gr1 s = new gr1("NO_CLOSE_CAUSE", 9);

    public static final boolean a(qj0 qj0Var, Object obj, fo2 fo2Var) {
        gr1 j2 = qj0Var.j(obj, fo2Var);
        if (j2 != null) {
            qj0Var.y(j2);
            return true;
        }
        return false;
    }
}
