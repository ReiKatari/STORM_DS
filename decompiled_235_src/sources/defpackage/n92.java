package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n92  reason: default package */
/* loaded from: classes.dex */
public final class n92 extends oi2 {
    public final Object e;
    public final String f;
    public final vl7 g;
    public final se0 h;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable, java.lang.Exception, se0] */
    public n92(Object obj, String str, vs0 vs0Var, vl7 vl7Var) {
        Collection asList;
        obj.getClass();
        vl7Var.getClass();
        this.e = obj;
        this.f = str;
        this.g = vl7Var;
        ?? exc = new Exception(str + " value: " + obj);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            if (length == 0) {
                asList = yt1.A;
            } else {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    asList = fv.T0(stackTrace);
                } else if (length == 1) {
                    asList = hf.b0(stackTrace[length2 - 1]);
                } else {
                    asList = Arrays.asList(fv.y0(stackTrace, length2 - length, length2));
                    asList.getClass();
                }
            }
            exc.setStackTrace((StackTraceElement[]) asList.toArray(new StackTraceElement[0]));
            this.h = exc;
            return;
        }
        i.f(lb1.k("Requested element count ", length, " is less than zero."));
        throw null;
    }

    @Override // defpackage.oi2
    public final Object o() {
        int i = m92.a[this.g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                i.d();
                return null;
            }
            Object obj = this.e;
            obj.getClass();
            Log.d("uh6", this.f + " value: " + obj);
            return null;
        }
        throw this.h;
    }

    @Override // defpackage.oi2
    public final oi2 U(String str, qn2 qn2Var) {
        return this;
    }
}
