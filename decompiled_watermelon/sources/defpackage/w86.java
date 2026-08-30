package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w86  reason: default package */
/* loaded from: classes.dex */
public final class w86 implements fv0, Iterable, f93 {
    public int B;
    public int R;
    public int X;
    public boolean Z;
    public int c0;
    public HashMap e0;
    public j14 f0;
    public int[] A = new int[0];
    public Object[] L = new Object[0];
    public final Object Y = new Object();
    public ArrayList d0 = new ArrayList();

    public final int b(mk2 mk2Var) {
        if (this.Z) {
            xu0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!mk2Var.a()) {
            or4.a("Anchor refers to a group that was removed");
        }
        return mk2Var.a;
    }

    public final void c() {
        this.e0 = new HashMap();
    }

    public final v86 d() {
        if (!this.Z) {
            this.X++;
            return new v86(this);
        }
        i.n("Cannot read while a writer is pending");
        return null;
    }

    public final z86 i() {
        if (this.Z) {
            xu0.a("Cannot start a writer when another writer is pending");
        }
        if (this.X > 0) {
            xu0.a("Cannot start a writer when a reader is pending");
        }
        this.Z = true;
        this.c0++;
        return new z86(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lo2(this, 0, this.B);
    }

    public final boolean j(mk2 mk2Var) {
        int e;
        if (mk2Var.a() && (e = y86.e(this.d0, mk2Var.a, this.B)) >= 0 && b53.x(this.d0.get(e), mk2Var)) {
            return true;
        }
        return false;
    }

    public final uk2 k(int i) {
        mk2 mk2Var;
        int i2;
        ArrayList arrayList;
        int e;
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            if (this.Z) {
                xu0.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.B) && (e = y86.e((arrayList = this.d0), i, i2)) >= 0) {
                mk2Var = (mk2) arrayList.get(e);
            } else {
                mk2Var = null;
            }
            if (mk2Var != null) {
                return (uk2) hashMap.get(mk2Var);
            }
        }
        return null;
    }
}
