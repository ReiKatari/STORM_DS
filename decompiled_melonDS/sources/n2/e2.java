package n2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e2 implements a3.d, Iterable, oc.a {
    public int B;
    public int R;
    public int X;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f9899b0;

    /* renamed from: d0  reason: collision with root package name */
    public HashMap f9901d0;

    /* renamed from: e0  reason: collision with root package name */
    public a1.x f9902e0;
    public int[] A = new int[0];
    public Object[] L = new Object[0];
    public final Object Y = new Object();

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList f9900c0 = new ArrayList();

    public final int a(a aVar) {
        if (this.Z) {
            t.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            l1.a("Anchor refers to a group that was removed");
        }
        return aVar.f9871a;
    }

    public final void b() {
        this.f9901d0 = new HashMap();
    }

    public final d2 c() {
        if (!this.Z) {
            this.X++;
            return new d2(this);
        }
        a0.j.p("Cannot read while a writer is pending");
        return null;
    }

    public final h2 d() {
        if (this.Z) {
            t.a("Cannot start a writer when another writer is pending");
        }
        if (this.X > 0) {
            t.a("Cannot start a writer when a reader is pending");
        }
        this.Z = true;
        this.f9899b0++;
        return new h2(this);
    }

    public final boolean e(a aVar) {
        int d4;
        if (aVar.a() && (d4 = g2.d(this.f9900c0, aVar.f9871a, this.B)) >= 0 && nc.k.a(this.f9900c0.get(d4), aVar)) {
            return true;
        }
        return false;
    }

    public final m0 f(int i2) {
        a aVar;
        int i10;
        ArrayList arrayList;
        int d4;
        HashMap hashMap = this.f9901d0;
        if (hashMap != null) {
            if (this.Z) {
                t.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i2 >= 0 && i2 < (i10 = this.B) && (d4 = g2.d((arrayList = this.f9900c0), i2, i10)) >= 0) {
                aVar = (a) arrayList.get(d4);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return (m0) hashMap.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l0(this, 0, this.B);
    }
}
