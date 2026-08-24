package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db0  reason: default package */
/* loaded from: classes.dex */
public final class db0 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final pr6 f;
    public final di7 g;
    public final HashMap h;
    public final sr6 i;
    public final sr6 j;

    public db0(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, pr6 pr6Var, di7 di7Var, HashMap hashMap, sr6 sr6Var, sr6 sr6Var2) {
        sr6Var.getClass();
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = pr6Var;
        this.g = di7Var;
        this.h = hashMap;
        this.i = sr6Var;
        this.j = sr6Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof db0) {
                db0 db0Var = (db0) obj;
                if (!this.a.equals(db0Var.a) || !this.b.equals(db0Var.b) || !this.c.equals(db0Var.c) || !this.d.equals(db0Var.d) || !this.e.equals(db0Var.e) || !nb3.k(this.f, db0Var.f) || !nb3.k(this.g, db0Var.g) || !this.h.equals(db0Var.h) || !nb3.k(this.i, db0Var.i) || !nb3.k(this.j, db0Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.b.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode4 + ((hashCode3 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        int i = 0;
        pr6 pr6Var = this.f;
        if (pr6Var == null) {
            hashCode = 0;
        } else {
            hashCode = pr6Var.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        di7 di7Var = this.g;
        if (di7Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = di7Var.hashCode();
        }
        int hashCode6 = (this.i.hashCode() + ((this.h.hashCode() + ((i2 + hashCode2) * 31)) * 31)) * 31;
        sr6 sr6Var = this.j;
        if (sr6Var != null) {
            i = sr6Var.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
