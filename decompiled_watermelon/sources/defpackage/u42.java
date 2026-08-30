package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u42  reason: default package */
/* loaded from: classes.dex */
public final class u42 extends gk2 {
    public final Object a;
    public final String b;
    public final w77 c;
    public final jc0 d;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable, jc0, java.lang.Exception] */
    public u42(Object obj, String str, iq0 iq0Var, w77 w77Var) {
        Collection asList;
        obj.getClass();
        w77Var.getClass();
        this.a = obj;
        this.b = str;
        this.c = w77Var;
        ?? exc = new Exception(str + " value: " + obj);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            if (length == 0) {
                asList = pp1.A;
            } else {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    asList = nu.F0(stackTrace);
                } else if (length == 1) {
                    asList = l07.b0(stackTrace[length2 - 1]);
                } else {
                    asList = Arrays.asList(nu.k0(stackTrace, length2 - length, length2));
                    asList.getClass();
                }
            }
            exc.setStackTrace((StackTraceElement[]) asList.toArray(new StackTraceElement[0]));
            this.d = exc;
            return;
        }
        i.g(wh1.j("Requested element count ", length, " is less than zero."));
        throw null;
    }

    @Override // defpackage.gk2
    public final Object y() {
        int i = t42.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                i.c();
                return null;
            }
            Object obj = this.a;
            obj.getClass();
            Log.d("g66", this.b + " value: " + obj);
            return null;
        }
        throw this.d;
    }

    @Override // defpackage.gk2
    public final gk2 d0(String str, mi2 mi2Var) {
        return this;
    }
}
