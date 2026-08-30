package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s32  reason: default package */
/* loaded from: classes.dex */
public final class s32 {
    public final ArrayList a;
    public final di b;
    public final cc0 c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final t32 g;
    public final li h;

    public s32(ArrayList arrayList, di diVar, qi0 qi0Var, int i, Map map, Integer num, t32 t32Var, li liVar) {
        qi0Var.getClass();
        map.getClass();
        this.a = arrayList;
        this.b = diVar;
        this.c = qi0Var;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = t32Var;
        this.h = liVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s32) {
                s32 s32Var = (s32) obj;
                if (this.a.equals(s32Var.a) && this.b == s32Var.b && b53.x(this.c, s32Var.c) && this.d == s32Var.d && b53.x(this.e, s32Var.e) && this.f.equals(s32Var.f) && this.g == s32Var.g && b53.x(this.h, s32Var.h)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode();
        int hashCode3 = this.b.hashCode();
        int hashCode4 = this.c.hashCode();
        int a = wh1.a(this.d, (hashCode4 + ((hashCode3 + ((hashCode2 + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode5 = this.f.hashCode();
        int hashCode6 = (this.g.hashCode() + ((hashCode5 + ((this.e.hashCode() + a) * 31)) * 31)) * 31;
        li liVar = this.h;
        if (liVar == null) {
            hashCode = 0;
        } else {
            hashCode = liVar.hashCode();
        }
        return hashCode6 + hashCode;
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
