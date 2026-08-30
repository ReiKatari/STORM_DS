package zc;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends CancellationException {
    public final transient f1 A;

    public z0(String str, Throwable th2, f1 f1Var) {
        super(str);
        this.A = f1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof z0) {
                z0 z0Var = (z0) obj;
                if (nc.k.a(z0Var.getMessage(), getMessage())) {
                    Object obj2 = z0Var.A;
                    if (obj2 == null) {
                        obj2 = i1.B;
                    }
                    Object obj3 = this.A;
                    if (obj3 == null) {
                        obj3 = i1.B;
                    }
                    if (!nc.k.a(obj2, obj3) || !nc.k.a(z0Var.getCause(), getCause())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i2;
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.A;
        if (obj == null) {
            obj = i1.B;
        }
        int i10 = 0;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        }
        return i11 + i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.A;
        if (obj == null) {
            obj = i1.B;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
