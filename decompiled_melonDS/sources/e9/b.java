package e9;

import fj.x;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4418a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4419b = new long[2];

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4420c = new ArrayList(2);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f4421d = new ArrayList(2);

    /* renamed from: e  reason: collision with root package name */
    public boolean f4422e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4423f;

    /* renamed from: g  reason: collision with root package name */
    public a f4424g;

    /* renamed from: h  reason: collision with root package name */
    public int f4425h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f4426i;

    public b(e eVar, String str) {
        this.f4426i = eVar;
        this.f4418a = str;
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i2 = 0; i2 < 2; i2++) {
            sb2.append(i2);
            this.f4420c.add(this.f4426i.A.d(sb2.toString()));
            sb2.append(".tmp");
            this.f4421d.add(this.f4426i.A.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c a() {
        if (!this.f4422e || this.f4424g != null || this.f4423f) {
            return null;
        }
        ArrayList arrayList = this.f4420c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            e eVar = this.f4426i;
            if (i2 < size) {
                if (!eVar.f4436j0.z((x) arrayList.get(i2))) {
                    try {
                        eVar.F(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i2++;
            } else {
                this.f4425h++;
                return new c(eVar, this);
            }
        }
    }
}
