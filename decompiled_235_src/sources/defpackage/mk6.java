package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk6  reason: default package */
/* loaded from: classes.dex */
public final class mk6 implements by0, Iterable, zf3 {
    public int B;
    public int R;
    public int X;
    public boolean Z;
    public int d0;
    public HashMap f0;
    public p94 g0;
    public int[] A = new int[0];
    public Object[] L = new Object[0];
    public final Object Y = new Object();
    public ArrayList e0 = new ArrayList();

    public final int a(sq2 sq2Var) {
        if (this.Z) {
            tx0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!sq2Var.a()) {
            r05.a("Anchor refers to a group that was removed");
        }
        return sq2Var.a;
    }

    public final void b() {
        this.f0 = new HashMap();
    }

    public final lk6 c() {
        if (!this.Z) {
            this.X++;
            return new lk6(this);
        }
        i.m("Cannot read while a writer is pending");
        return null;
    }

    public final pk6 d() {
        if (this.Z) {
            tx0.a("Cannot start a writer when another writer is pending");
        }
        if (this.X > 0) {
            tx0.a("Cannot start a writer when a reader is pending");
        }
        this.Z = true;
        this.d0++;
        return new pk6(this);
    }

    public final boolean f(sq2 sq2Var) {
        int e;
        if (sq2Var.a() && (e = ok6.e(this.e0, sq2Var.a, this.B)) >= 0 && nb3.k(this.e0.get(e), sq2Var)) {
            return true;
        }
        return false;
    }

    public final zq2 g(int i) {
        sq2 sq2Var;
        int i2;
        ArrayList arrayList;
        int e;
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            if (this.Z) {
                tx0.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.B) && (e = ok6.e((arrayList = this.e0), i, i2)) >= 0) {
                sq2Var = (sq2) arrayList.get(e);
            } else {
                sq2Var = null;
            }
            if (sq2Var != null) {
                return (zq2) hashMap.get(sq2Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ou2(this, 0, this.B);
    }
}
