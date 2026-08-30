package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v80  reason: default package */
/* loaded from: classes.dex */
public final class v80 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final zf6 f;
    public final f47 g;
    public final HashMap h;
    public final bg6 i;
    public final bg6 j;

    public v80(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, zf6 zf6Var, f47 f47Var, HashMap hashMap, bg6 bg6Var, bg6 bg6Var2) {
        bg6Var.getClass();
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = zf6Var;
        this.g = f47Var;
        this.h = hashMap;
        this.i = bg6Var;
        this.j = bg6Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v80) {
                v80 v80Var = (v80) obj;
                if (!this.a.equals(v80Var.a) || !this.b.equals(v80Var.b) || !this.c.equals(v80Var.c) || !this.d.equals(v80Var.d) || !this.e.equals(v80Var.e) || !b53.x(this.f, v80Var.f) || !b53.x(this.g, v80Var.g) || !this.h.equals(v80Var.h) || !b53.x(this.i, v80Var.i) || !b53.x(this.j, v80Var.j)) {
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
        zf6 zf6Var = this.f;
        if (zf6Var == null) {
            hashCode = 0;
        } else {
            hashCode = zf6Var.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        f47 f47Var = this.g;
        if (f47Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f47Var.hashCode();
        }
        int hashCode6 = (this.i.hashCode() + ((this.h.hashCode() + ((i2 + hashCode2) * 31)) * 31)) * 31;
        bg6 bg6Var = this.j;
        if (bg6Var != null) {
            i = bg6Var.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
