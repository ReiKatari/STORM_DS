package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb2  reason: default package */
/* loaded from: classes.dex */
public final class wb2 extends hw6 implements eo2 {
    public Uri[] X;
    public int Y;
    public int Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ xb2 f0;
    public final /* synthetic */ Set g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb2(xb2 xb2Var, Set set, r41 r41Var) {
        super(2, r41Var);
        this.f0 = xb2Var;
        this.g0 = set;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((wb2) q((r41) obj2, (ne2) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        wb2 wb2Var = new wb2(this.f0, this.g0, r41Var);
        wb2Var.e0 = obj;
        return wb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0045 -> B:25:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:25:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0088 -> B:25:0x008b). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int length;
        int i;
        Uri[] uriArr;
        Long l;
        ne2 ne2Var = (ne2) this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.d0;
        xb2 xb2Var = this.f0;
        if (i2 != 0) {
            if (i2 == 1) {
                length = this.Z;
                i = this.Y;
                uriArr = this.X;
                oi2.Y(obj);
                i++;
                if (i < length) {
                    Uri uri = uriArr[i];
                    String uri2 = uri.toString();
                    uri2.getClass();
                    Set set = this.g0;
                    if (set == null || set.contains(uri2)) {
                        if (!xb2Var.p(uri)) {
                            Log.w("FSRomsRepository", "ROM directory permission is missing; reauthorization required for " + uri);
                            kb2 j = xb2Var.j(uri);
                            if (j != null) {
                                l = new Long(j.c);
                            } else {
                                l = null;
                            }
                            xb2Var.s(uri, l);
                        } else {
                            qi6 h = zl1.h(xb2Var.a, uri);
                            this.e0 = ne2Var;
                            this.X = uriArr;
                            this.Y = i;
                            this.Z = length;
                            this.d0 = 1;
                            if (xb2.c(xb2Var, uri, h, ne2Var, this) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                    i++;
                    if (i < length) {
                        return jg7.a;
                    }
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            Uri[] r = ((ng6) xb2Var.c).r();
            xb2Var.C(r);
            length = r.length;
            i = 0;
            uriArr = r;
            if (i < length) {
            }
        }
    }
}
