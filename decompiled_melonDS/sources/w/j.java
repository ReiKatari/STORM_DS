package w;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13974a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.a f13975b;

    /* renamed from: c  reason: collision with root package name */
    public final j0.f f13976c;

    /* renamed from: d  reason: collision with root package name */
    public final j0.l0 f13977d;

    /* renamed from: e  reason: collision with root package name */
    public final x.p f13978e;

    /* renamed from: f  reason: collision with root package name */
    public final q0 f13979f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13980g;

    /* renamed from: i  reason: collision with root package name */
    public final d0.y f13982i;

    /* renamed from: j  reason: collision with root package name */
    public final d0.b1 f13983j;

    /* renamed from: k  reason: collision with root package name */
    public final d0.r f13984k;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f13981h = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final Object f13985l = new Object();
    public ArrayList m = new ArrayList();

    public j(Context context, j0.f fVar, d0.r rVar, long j2, d0.y yVar, jb.c cVar) {
        this.f13974a = context;
        this.f13976c = fVar;
        x.p a10 = x.p.a(context, fVar.f7179b);
        this.f13978e = a10;
        this.f13979f = q0.b(context);
        b0.a aVar = new b0.a(a10);
        this.f13975b = aVar;
        j0.l0 l0Var = new j0.l0(aVar);
        this.f13977d = l0Var;
        synchronized (aVar.f1732a) {
            aVar.f1734c.add(l0Var);
        }
        this.f13980g = j2;
        this.f13982i = yVar;
        this.f13984k = rVar;
        try {
            List asList = Arrays.asList(a10.c());
            this.f13983j = new d0.b1(asList, a10, fVar.f7178a);
            e(asList);
        } catch (x.a e6) {
            throw new Exception(new Exception(e6));
        }
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f13985l) {
            linkedHashSet = new LinkedHashSet(this.m);
        }
        return linkedHashSet;
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            if (!str.equals("0") && !str.equals("1")) {
                if (p7.k.r(str, this.f13978e)) {
                    arrayList2.add(str);
                } else {
                    aj.g.o("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            } else {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public final x c(String str) {
        synchronized (this.f13985l) {
            if (!this.m.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.f13974a;
        x.p pVar = this.f13978e;
        y d4 = d(str);
        b0.a aVar = this.f13975b;
        j0.l0 l0Var = this.f13977d;
        j0.f fVar = this.f13976c;
        return new x(context, pVar, str, d4, aVar, l0Var, fVar.f7178a, fVar.f7179b, this.f13979f, this.f13980g, this.f13982i);
    }

    public final y d(String str) {
        HashMap hashMap = this.f13981h;
        try {
            y yVar = (y) hashMap.get(str);
            if (yVar == null) {
                y yVar2 = new y(str, this.f13978e);
                hashMap.put(str, yVar2);
                return yVar2;
            }
            return yVar;
        } catch (x.a e6) {
            throw new Exception(e6);
        }
    }

    public final void e(List list) {
        try {
            ArrayList b10 = b(p7.l.r(this, this.f13984k, new ArrayList(list)));
            synchronized (this.f13985l) {
                if (this.m.equals(b10)) {
                    return;
                }
                aj.g.o("Camera2CameraFactory", "Updated available camera list: " + this.m + " -> " + b10);
                this.m = b10;
            }
        } catch (d0.a1 e6) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e6);
            throw e6;
        }
    }
}
