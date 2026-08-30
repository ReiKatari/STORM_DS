package h8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import m9.o;
import mc.l;
import p7.t;
import zb.k;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends k0.d {

    /* renamed from: e  reason: collision with root package name */
    public final Object f6330e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6331f;

    /* renamed from: g  reason: collision with root package name */
    public final i f6332g;

    /* renamed from: h  reason: collision with root package name */
    public final ch.a f6333h;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, ch.a, java.lang.Exception] */
    public g(Object obj, String str, a aVar, i iVar) {
        Collection collection;
        obj.getClass();
        iVar.getClass();
        this.f6330e = obj;
        this.f6331f = str;
        this.f6332g = iVar;
        ?? exc = new Exception(str + " value: " + obj);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            if (length == 0) {
                collection = q.A;
            } else {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    collection = k.Q(stackTrace);
                } else if (length == 1) {
                    collection = t.x(stackTrace[length2 - 1]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i2 = length2 - length; i2 < length2; i2++) {
                        arrayList.add(stackTrace[i2]);
                    }
                    collection = arrayList;
                }
            }
            exc.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.f6333h = exc;
            return;
        }
        a0.j.e(w.d.m("Requested element count ", length, " is less than zero."));
        throw null;
    }

    @Override // k0.d
    public final Object o() {
        int i2 = f.f6329a[this.f6332g.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                o.o();
                return null;
            }
            Object obj = this.f6330e;
            obj.getClass();
            Log.d("g", this.f6331f + " value: " + obj);
            return null;
        }
        throw this.f6333h;
    }

    @Override // k0.d
    public final k0.d H(String str, l lVar) {
        return this;
    }
}
