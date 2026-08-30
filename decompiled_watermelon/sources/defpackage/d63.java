package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d63  reason: default package */
/* loaded from: classes.dex */
public final class d63 extends CancellationException {
    public final transient c63 A;

    public d63(String str, Throwable th, p63 p63Var) {
        super(str);
        this.A = p63Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d63) {
                d63 d63Var = (d63) obj;
                if (b53.x(d63Var.getMessage(), getMessage())) {
                    Object obj2 = d63Var.A;
                    if (obj2 == null) {
                        obj2 = s74.B;
                    }
                    Object obj3 = this.A;
                    if (obj3 == null) {
                        obj3 = s74.B;
                    }
                    if (!b53.x(obj2, obj3) || !b53.x(d63Var.getCause(), getCause())) {
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
            obj = s74.B;
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
            obj = s74.B;
        }
        sb.append(obj);
        return sb.toString();
    }
}
