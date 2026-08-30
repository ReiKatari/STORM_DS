package l;

import a6.j1;
import ai.x0;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.y0;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import p1.n0;
import p1.o0;
import q.e2;
import q.f3;
import q.j3;
import q.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i0 implements com.squareup.picasso.f, b5.j, m0.a, e2, p.w, p.j, w0 {
    public final /* synthetic */ int A;
    public Object B;

    public i0(int i2) {
        Object aVar;
        this.A = i2;
        switch (i2) {
            case 20:
                this.B = new ConcurrentHashMap(16);
                return;
            case 22:
                TimeUnit.MINUTES.getClass();
                si.c cVar = si.c.f12936l;
                cVar.getClass();
                this.B = new ti.p(cVar);
                return;
            case 29:
                this.B = p7.t.f(Looper.getMainLooper());
                return;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar = new Object();
                } else {
                    aVar = new l7.a(10);
                }
                this.B = aVar;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList j(i0 i0Var, String str) {
        int i2;
        char charAt;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c4;
        long c10;
        float intBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && nc.k.b(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && nc.k.b(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i2 = i12 + 1;
                charAt = str.charAt(i12);
                int i14 = charAt | ' ';
                if ((i14 - 122) * (i14 - 97) > 0 || i14 == 101) {
                    if (i2 >= length) {
                        charAt = i11;
                    } else {
                        i12 = i2;
                    }
                }
            }
            if (charAt != 0) {
                int i15 = charAt | ' ';
                if (i15 != 122) {
                    while (i2 < length && nc.k.b(str.charAt(i2), 32) <= 0) {
                        i2++;
                    }
                    if (i15 == 97) {
                        c4 = 1;
                    } else {
                        c4 = i11;
                    }
                    int i16 = i11;
                    do {
                        if (c4 != 0 && 3 <= i16 && i16 < 5) {
                            c10 = o3.b.c(i2, Math.min(i2 + 1, length), str);
                        } else {
                            c10 = o3.b.c(i2, length, str);
                        }
                        i2 = (int) (c10 >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (c10 & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = (float[]) i0Var.B;
                            int i17 = i16 + 1;
                            fArr[i16] = intBitsToFloat;
                            if (i17 >= fArr.length) {
                                float[] fArr2 = new float[i17 * 2];
                                i0Var.B = fArr2;
                                System.arraycopy(fArr, i11, fArr2, i11, fArr.length);
                            }
                            i16 = i17;
                        }
                        while (i2 < length && (nc.k.b(str.charAt(i2), 32) <= 0 || str.charAt(i2) == ',')) {
                            i2++;
                        }
                        if (i2 < length) {
                        }
                        i13 = i16;
                    } while (!Float.isNaN(intBitsToFloat));
                    i13 = i16;
                }
                float[] fArr3 = (float[]) i0Var.B;
                int i18 = 2;
                switch (charAt) {
                    case 'A':
                        i10 = i11;
                        int i19 = i13 - 7;
                        for (int i20 = i10; i20 <= i19; i20 += 7) {
                            float f8 = fArr3[i20];
                            float f10 = fArr3[i20 + 1];
                            float f11 = fArr3[i20 + 2];
                            if (Float.compare(fArr3[i20 + 3], 0.0f) != 0) {
                                z10 = 1;
                            } else {
                                z10 = i10;
                            }
                            if (Float.compare(fArr3[i20 + 4], 0.0f) != 0) {
                                z11 = 1;
                            } else {
                                z11 = i10;
                            }
                            arrayList.add(new o3.i(f8, f10, f11, z10, z11, fArr3[i20 + 5], fArr3[i20 + 6]));
                        }
                        break;
                    case 'C':
                        i10 = i11;
                        int i21 = i13 - 6;
                        for (int i22 = i10; i22 <= i21; i22 += 6) {
                            arrayList.add(new o3.k(fArr3[i22], fArr3[i22 + 1], fArr3[i22 + 2], fArr3[i22 + 3], fArr3[i22 + 4], fArr3[i22 + 5]));
                        }
                        break;
                    case 'H':
                        i10 = i11;
                        int i23 = i13 - 1;
                        for (int i24 = i10; i24 <= i23; i24++) {
                            arrayList.add(new o3.l(fArr3[i24]));
                        }
                        break;
                    case 'L':
                        i10 = i11;
                        int i25 = i13 - 2;
                        for (int i26 = i10; i26 <= i25; i26 += 2) {
                            arrayList.add(new o3.m(fArr3[i26], fArr3[i26 + 1]));
                        }
                        break;
                    case 'M':
                        i10 = i11;
                        int i27 = i13 - 2;
                        if (i27 >= 0) {
                            arrayList.add(new o3.n(fArr3[i10], fArr3[1]));
                            while (i18 <= i27) {
                                arrayList.add(new o3.m(fArr3[i18], fArr3[i18 + 1]));
                                i18 += 2;
                            }
                            break;
                        }
                        break;
                    case 'Q':
                        i10 = i11;
                        int i28 = i13 - 4;
                        for (int i29 = i10; i29 <= i28; i29 += 4) {
                            arrayList.add(new o3.o(fArr3[i29], fArr3[i29 + 1], fArr3[i29 + 2], fArr3[i29 + 3]));
                        }
                        break;
                    case 'S':
                        i10 = i11;
                        int i30 = i13 - 4;
                        for (int i31 = i10; i31 <= i30; i31 += 4) {
                            arrayList.add(new o3.p(fArr3[i31], fArr3[i31 + 1], fArr3[i31 + 2], fArr3[i31 + 3]));
                        }
                        break;
                    case 'T':
                        i10 = i11;
                        int i32 = i13 - 2;
                        for (int i33 = i10; i33 <= i32; i33 += 2) {
                            arrayList.add(new o3.q(fArr3[i33], fArr3[i33 + 1]));
                        }
                        break;
                    case 'V':
                        i10 = i11;
                        int i34 = i13 - 1;
                        for (int i35 = i10; i35 <= i34; i35++) {
                            arrayList.add(new o3.a0(fArr3[i35]));
                        }
                        break;
                    case 'Z':
                    case 'z':
                        i10 = i11;
                        arrayList.add(o3.j.f10771c);
                        break;
                    case 'a':
                        int i36 = i13 - 7;
                        int i37 = i11;
                        while (i37 <= i36) {
                            float f12 = fArr3[i37];
                            float f13 = fArr3[i37 + 1];
                            float f14 = fArr3[i37 + 2];
                            char c11 = i11;
                            if (Float.compare(fArr3[i37 + 3], 0.0f) != 0) {
                                z12 = 1;
                            } else {
                                z12 = c11;
                            }
                            if (Float.compare(fArr3[i37 + 4], 0.0f) != 0) {
                                z13 = 1;
                            } else {
                                z13 = c11;
                            }
                            arrayList.add(new o3.r(f12, f13, f14, z12, z13, fArr3[i37 + 5], fArr3[i37 + 6]));
                            i37 += 7;
                            i11 = c11;
                        }
                        i10 = i11;
                        break;
                    case 'c':
                        int i38 = i13 - 6;
                        for (int i39 = i11; i39 <= i38; i39 += 6) {
                            arrayList.add(new o3.s(fArr3[i39], fArr3[i39 + 1], fArr3[i39 + 2], fArr3[i39 + 3], fArr3[i39 + 4], fArr3[i39 + 5]));
                        }
                        i10 = i11;
                        break;
                    case 'h':
                        int i40 = i13 - 1;
                        for (int i41 = i11; i41 <= i40; i41++) {
                            arrayList.add(new o3.t(fArr3[i41]));
                        }
                        i10 = i11;
                        break;
                    case 'l':
                        int i42 = i13 - 2;
                        for (int i43 = i11; i43 <= i42; i43 += 2) {
                            arrayList.add(new o3.u(fArr3[i43], fArr3[i43 + 1]));
                        }
                        i10 = i11;
                        break;
                    case 'm':
                        int i44 = i13 - 2;
                        if (i44 >= 0) {
                            arrayList.add(new o3.v(fArr3[i11], fArr3[1]));
                            while (i18 <= i44) {
                                arrayList.add(new o3.u(fArr3[i18], fArr3[i18 + 1]));
                                i18 += 2;
                            }
                        }
                        i10 = i11;
                        break;
                    case 'q':
                        int i45 = i13 - 4;
                        for (int i46 = i11; i46 <= i45; i46 += 4) {
                            arrayList.add(new o3.w(fArr3[i46], fArr3[i46 + 1], fArr3[i46 + 2], fArr3[i46 + 3]));
                        }
                        i10 = i11;
                        break;
                    case 's':
                        int i47 = i13 - 4;
                        for (int i48 = i11; i48 <= i47; i48 += 4) {
                            arrayList.add(new o3.x(fArr3[i48], fArr3[i48 + 1], fArr3[i48 + 2], fArr3[i48 + 3]));
                        }
                        i10 = i11;
                        break;
                    case 't':
                        int i49 = i13 - 2;
                        for (int i50 = i11; i50 <= i49; i50 += 2) {
                            arrayList.add(new o3.y(fArr3[i50], fArr3[i50 + 1]));
                        }
                        i10 = i11;
                        break;
                    case 'v':
                        int i51 = i13 - 1;
                        for (int i52 = i11; i52 <= i51; i52++) {
                            arrayList.add(new o3.z(fArr3[i52]));
                        }
                        i10 = i11;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + charAt);
                }
                i12 = i2;
                i11 = i10;
            } else {
                i12 = i2;
            }
        }
        return arrayList;
    }

    public static n0 p(i0 i0Var, int i2) {
        mc.l lVar;
        n1.x xVar = (n1.x) i0Var.B;
        z2.f e6 = z2.q.e();
        if (e6 != null) {
            lVar = e6.e();
        } else {
            lVar = null;
        }
        mc.l lVar2 = lVar;
        z2.f h2 = z2.q.h(e6);
        try {
            n1.p pVar = (n1.p) xVar.f9852f.getValue();
            z2.q.k(e6, h2, lVar2);
            return xVar.f9861p.a(i2, pVar.f9809j, xVar.f9850d, new l4.c0(i2, pVar));
        } catch (Throwable th2) {
            z2.q.k(e6, h2, lVar2);
            throw th2;
        }
    }

    @Override // p.w
    public void a(p.l lVar, boolean z10) {
        if (lVar instanceof p.d0) {
            ((p.d0) lVar).f11087z.k().c(false);
        }
        p.w wVar = ((q.j) this.B).X;
        if (wVar != null) {
            wVar.a(lVar, z10);
        }
    }

    @Override // m0.a
    public ta.a apply(Object obj) {
        return m0.i.c(((t.a) this.B).apply(obj));
    }

    @Override // p.j
    public void c(p.l lVar) {
        p.j jVar = ((ActionMenuView) this.B).f953s0;
        if (jVar != null) {
            jVar.c(lVar);
        }
    }

    @Override // p.j
    public boolean e(p.l lVar, MenuItem menuItem) {
        boolean z10;
        q.m mVar = ((ActionMenuView) this.B).f958x0;
        if (mVar != null) {
            Toolbar toolbar = ((f3) mVar).A;
            Iterator it = ((CopyOnWriteArrayList) toolbar.D0.L).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((y0) it.next()).f1440a.p(menuItem)) {
                        z10 = true;
                        break;
                    }
                } else {
                    j3 j3Var = toolbar.F0;
                    if (j3Var != null) {
                        z10 = ((d0) j3Var).A.m.onMenuItemSelected(0, menuItem);
                    } else {
                        z10 = false;
                    }
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.picasso.f
    public void g(Exception exc) {
        ((ImageView) ((lh.c) this.B).f9096u.f14091d).setVisibility(8);
    }

    @Override // b5.j
    public Object h(b5.i iVar) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 3:
                m0.d dVar = (m0.d) this.B;
                if (dVar.B == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7.m.o("The result can only set once!", z10);
                dVar.B = iVar;
                return "FutureChain[" + dVar + "]";
            default:
                m0.m mVar = (m0.m) this.B;
                if (mVar.Y == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p7.m.o("The result can only set once!", z11);
                mVar.Y = iVar;
                return "ListFuture[" + this + "]";
        }
    }

    public void i() {
        ((n2.v) this.B).getClass();
    }

    @Override // p.w
    public boolean l(p.l lVar) {
        q.j jVar = (q.j) this.B;
        if (lVar != jVar.L) {
            ((p.d0) lVar).A.getClass();
            p.w wVar = jVar.X;
            if (wVar != null) {
                return wVar.l(lVar);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nc.r] */
    public ArrayList m(int i2) {
        mc.l lVar;
        o1.n nVar;
        ArrayList arrayList = new ArrayList();
        o1.t tVar = (o1.t) this.B;
        z2.f e6 = z2.q.e();
        if (e6 != null) {
            lVar = e6.e();
        } else {
            lVar = null;
        }
        z2.f h2 = z2.q.h(e6);
        try {
            if (tVar.f10590b) {
                nVar = tVar.f10591c;
            } else {
                nVar = (o1.n) tVar.f10593e.getValue();
            }
            o1.n nVar2 = nVar;
            if (nVar2 != null) {
                ?? obj = new Object();
                obj.A = 1;
                List list = (List) nVar2.f10552k.k(Integer.valueOf(i2));
                int size = list.size();
                int i10 = 0;
                nc.r rVar = obj;
                while (i10 < size) {
                    yb.j jVar = (yb.j) list.get(i10);
                    o0 o0Var = tVar.f10602o;
                    int intValue = ((Number) jVar.A).intValue();
                    long j2 = ((x4.a) jVar.B).f14337a;
                    p1.a0 a0Var = o1.t.f10588w;
                    nc.r rVar2 = rVar;
                    arrayList.add(o0Var.a(intValue, j2, false, new x0((ArrayList) null, rVar2, list, i2, nVar2)));
                    i10++;
                    rVar = rVar2;
                }
            }
            z2.q.k(e6, h2, lVar);
            return arrayList;
        } catch (Throwable th2) {
            z2.q.k(e6, h2, lVar);
            throw th2;
        }
    }

    @Override // q.e2
    public void n(p.l lVar, MenuItem menuItem) {
        ((p.f) this.B).Y.removeCallbacksAndMessages(lVar);
    }

    @Override // q.e2
    public void o(p.l lVar, p.n nVar) {
        p.f fVar = (p.f) this.B;
        Handler handler = fVar.Y;
        p.e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f11091b0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (lVar == ((p.e) arrayList.get(i2)).f11089b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i10 = i2 + 1;
        if (i10 < arrayList.size()) {
            eVar = (p.e) arrayList.get(i10);
        }
        handler.postAtTime(new j1(this, eVar, nVar, lVar), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.squareup.picasso.f
    public void k() {
    }

    @Override // q.w0
    public void b(int i2) {
    }

    @Override // q.w0
    public void d(int i2) {
    }

    @Override // q.w0
    public void f(int i2, float f8) {
    }

    public /* synthetic */ i0(int i2, boolean z10) {
        this.A = i2;
    }

    public /* synthetic */ i0(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public i0(TextView textView) {
        this.A = 14;
        this.B = new o6.g(textView);
    }

    public i0(EditText editText) {
        this.A = 13;
        this.B = new jb.c(editText);
    }

    public i0(FileInputStream fileInputStream) {
        this.A = 21;
        this.B = new pd.k(fileInputStream, vc.a.f13781a);
    }
}
