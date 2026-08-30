package n0;

import d0.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f9713a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9714b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9715c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9716d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9717e;

    /* renamed from: f  reason: collision with root package name */
    public final v0.d f9718f;

    /* renamed from: g  reason: collision with root package name */
    public final v1 f9719g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f9720h;

    /* renamed from: i  reason: collision with root package name */
    public final i f9721i;

    /* renamed from: j  reason: collision with root package name */
    public final i f9722j;

    public b(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, v0.d dVar, v1 v1Var, HashMap hashMap, i iVar, i iVar2) {
        iVar.getClass();
        this.f9713a = linkedHashSet;
        this.f9714b = arrayList;
        this.f9715c = arrayList2;
        this.f9716d = arrayList3;
        this.f9717e = arrayList4;
        this.f9718f = dVar;
        this.f9719g = v1Var;
        this.f9720h = hashMap;
        this.f9721i = iVar;
        this.f9722j = iVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f9713a.equals(bVar.f9713a) || !this.f9714b.equals(bVar.f9714b) || !this.f9715c.equals(bVar.f9715c) || !this.f9716d.equals(bVar.f9716d) || !this.f9717e.equals(bVar.f9717e) || !nc.k.a(this.f9718f, bVar.f9718f) || !nc.k.a(this.f9719g, bVar.f9719g) || !this.f9720h.equals(bVar.f9720h) || !nc.k.a(this.f9721i, bVar.f9721i) || !nc.k.a(this.f9722j, bVar.f9722j)) {
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
        int hashCode3 = this.f9714b.hashCode();
        int hashCode4 = this.f9715c.hashCode();
        int hashCode5 = (this.f9717e.hashCode() + ((this.f9716d.hashCode() + ((hashCode4 + ((hashCode3 + (this.f9713a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        int i2 = 0;
        v0.d dVar = this.f9718f;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        int i10 = (hashCode5 + hashCode) * 31;
        v1 v1Var = this.f9719g;
        if (v1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = v1Var.hashCode();
        }
        int hashCode6 = (this.f9721i.hashCode() + ((this.f9720h.hashCode() + ((i10 + hashCode2) * 31)) * 31)) * 31;
        i iVar = this.f9722j;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f9713a + ", cameraUseCases=" + this.f9714b + ", cameraUseCasesToAttach=" + this.f9715c + ", cameraUseCasesToKeep=" + this.f9716d + ", cameraUseCasesToDetach=" + this.f9717e + ", streamSharing=" + this.f9718f + ", placeholderForExtensions=" + this.f9719g + ", useCaseConfigs=" + this.f9720h + ", primaryStreamSpecResult=" + this.f9721i + ", secondaryStreamSpecResult=" + this.f9722j + ')';
    }
}
