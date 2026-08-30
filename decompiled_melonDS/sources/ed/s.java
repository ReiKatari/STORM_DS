package ed;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4467a = 0;

    static {
        Object kVar;
        Object kVar2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            kVar = ec.a.class.getCanonicalName();
        } catch (Throwable th2) {
            kVar = new yb.k(th2);
        }
        if (yb.l.a(kVar) != null) {
            kVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) kVar;
        try {
            kVar2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            kVar2 = new yb.k(th3);
        }
        if (yb.l.a(kVar2) != null) {
            kVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) kVar2;
    }
}
