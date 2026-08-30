package o3;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f10697a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10698b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10699c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10700d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10701e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10702f;

    /* renamed from: g  reason: collision with root package name */
    public final float f10703g;

    /* renamed from: h  reason: collision with root package name */
    public final float f10704h;

    /* renamed from: i  reason: collision with root package name */
    public final List f10705i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f10706j;

    public d(String str, float f8, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        f8 = (i2 & 2) != 0 ? 0.0f : f8;
        f10 = (i2 & 4) != 0 ? 0.0f : f10;
        f11 = (i2 & 8) != 0 ? 0.0f : f11;
        f12 = (i2 & 16) != 0 ? 1.0f : f12;
        f13 = (i2 & 32) != 0 ? 1.0f : f13;
        f14 = (i2 & 64) != 0 ? 0.0f : f14;
        f15 = (i2 & 128) != 0 ? 0.0f : f15;
        if ((i2 & 256) != 0) {
            int i10 = h0.f10763a;
            list = zb.q.A;
        }
        ArrayList arrayList = new ArrayList();
        this.f10697a = str;
        this.f10698b = f8;
        this.f10699c = f10;
        this.f10700d = f11;
        this.f10701e = f12;
        this.f10702f = f13;
        this.f10703g = f14;
        this.f10704h = f15;
        this.f10705i = list;
        this.f10706j = arrayList;
    }
}
