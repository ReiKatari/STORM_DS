package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc3  reason: default package */
/* loaded from: classes.dex */
public final class sc3 extends CancellationException {
    public final transient rc3 A;

    public sc3(String str, Throwable th, ed3 ed3Var) {
        super(str);
        this.A = ed3Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof sc3) {
                sc3 sc3Var = (sc3) obj;
                if (nb3.k(sc3Var.getMessage(), getMessage())) {
                    Object obj2 = sc3Var.A;
                    if (obj2 == null) {
                        obj2 = kg4.B;
                    }
                    Object obj3 = this.A;
                    if (obj3 == null) {
                        obj3 = kg4.B;
                    }
                    if (!nb3.k(obj2, obj3) || !nb3.k(sc3Var.getCause(), getCause())) {
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
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.A;
        if (obj == null) {
            obj = kg4.B;
        }
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i2 = cause.hashCode();
        }
        return i3 + i2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.A;
        if (obj == null) {
            obj = kg4.B;
        }
        sb.append(obj);
        return sb.toString();
    }
}
