package defpackage;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends po2 implements qn2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.d0 = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x04ca, code lost:
        if (r0 == null) goto L236;
     */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i;
        UUID uuid;
        dn0 dn0Var;
        Object em5Var;
        long j;
        Object em5Var2;
        long j2;
        Object em5Var3;
        Object em5Var4;
        boolean z;
        int i2;
        Integer valueOf;
        boolean z2;
        tu0 tu0Var;
        float h;
        int i3 = this.d0;
        float f = RecyclerView.B1;
        String str = "";
        int i4 = 0;
        String str2 = null;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.B;
        switch (i3) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h0 h0Var = (h0) obj2;
                u94 u94Var = h0Var.z0;
                if (booleanValue) {
                    h0Var.b1();
                } else {
                    if (h0Var.m0 != null) {
                        Object[] objArr = u94Var.c;
                        long[] jArr = u94Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j3 = jArr[i5];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((255 & j3) < 128) {
                                            i = i6;
                                            hv.L(h0Var.F0(), null, null, new f0(h0Var, (l25) objArr[(i5 << 3) + i8], null, 0), 3);
                                        } else {
                                            i = i6;
                                        }
                                        j3 >>= i;
                                        i8++;
                                        i6 = i;
                                    }
                                    if (i7 != i6) {
                                    }
                                }
                                if (i5 != length) {
                                    i5++;
                                }
                            }
                        }
                        l25 l25Var = h0Var.B0;
                        if (l25Var != null) {
                            hv.L(h0Var.F0(), null, null, new f0(h0Var, l25Var, null, 1), 3);
                        }
                    }
                    u94Var.a();
                    h0Var.B0 = null;
                    h0Var.c1();
                }
                return jg7Var;
            case 1:
                ta5 ta5Var = (ta5) obj;
                ta5Var.getClass();
                nx1 nx1Var = (nx1) obj2;
                nx1Var.getClass();
                nx1Var.f.k(lb1.h(ta5Var.a, "https://retroachievements.org/leaderboardinfo.php?i="));
                return jg7Var;
            case 2:
                n00 n00Var = (n00) obj;
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj2;
                int i9 = BackgroundsActivity.B0;
                backgroundsActivity.getClass();
                if (n00Var != null) {
                    uuid = n00Var.a;
                } else {
                    uuid = null;
                }
                Intent intent = new Intent();
                if (uuid != null) {
                    str2 = uuid.toString();
                }
                intent.putExtra("selected_background_id", str2);
                backgroundsActivity.setResult(-1, intent);
                backgroundsActivity.finish();
                return jg7Var;
            case 3:
                jo0 jo0Var = (jo0) obj;
                jo0Var.getClass();
                aq0 aq0Var = (aq0) obj2;
                aq0Var.getClass();
                if (!qs6.v0(jo0Var.a) && !qs6.v0(jo0Var.c) && (dn0Var = (dn0) aq0Var.c.a("selected_folder")) != null) {
                    hv.L(to7.a(aq0Var), null, null, new b0(aq0Var, dn0Var, jo0Var, (r41) null, 14), 3);
                }
                return jg7Var;
            case 4:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                dSiWareTitle.getClass();
                la1 la1Var = (la1) obj2;
                la1Var.getClass();
                hv.L(to7.a(la1Var), null, null, new ga1(la1Var, dSiWareTitle, null, 1), 3);
                return jg7Var;
            case 5:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                dSiWareTitle2.getClass();
                la1 la1Var2 = (la1) obj2;
                la1Var2.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(dSiWareTitle2.getIcon()));
                return new ix5(createBitmap, ((ng6) la1Var2.c).q());
            case 6:
                sz1 sz1Var = (sz1) obj2;
                sz1Var.getClass();
                sz1Var.j1(new c70((String) obj, 5));
                return jg7Var;
            case 7:
                sz1 sz1Var2 = (sz1) obj2;
                sz1Var2.getClass();
                sz1Var2.j1(new c70((String) obj, 6));
                return jg7Var;
            case 8:
                zl1 zl1Var = (zl1) obj;
                zl1Var.getClass();
                return ((fb2) obj2).d(zl1Var, "bios7.bin", 16384L);
            case 9:
                zl1 zl1Var2 = (zl1) obj;
                zl1Var2.getClass();
                return ((fb2) obj2).d(zl1Var2, "bios9.bin", 4096L);
            case 10:
                zl1 zl1Var3 = (zl1) obj;
                zl1Var3.getClass();
                fb2 fb2Var = (fb2) obj2;
                fb2Var.getClass();
                zl1 f2 = zl1Var3.f("firmware.bin");
                if (f2 == null) {
                    return bz0.MISSING;
                }
                try {
                    if (nb3.k(f2.j().getScheme(), "file")) {
                        String path = f2.j().getPath();
                        if (path != null) {
                            str = path;
                        }
                        j = new File(str).length();
                    } else {
                        AssetFileDescriptor openAssetFileDescriptor = fb2Var.b.getContentResolver().openAssetFileDescriptor(f2.j(), "r");
                        if (openAssetFileDescriptor != null) {
                            long length2 = openAssetFileDescriptor.getLength();
                            openAssetFileDescriptor.close();
                            j = length2;
                        } else {
                            j = -1;
                        }
                    }
                    if (j == -1) {
                        em5Var = bz0.MISSING;
                    } else {
                        if (j != 131072 && j != 262144 && j != 524288) {
                            em5Var = bz0.INVALID;
                        }
                        em5Var = bz0.PRESENT;
                    }
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                Object obj3 = bz0.MISSING;
                if (em5Var instanceof em5) {
                    em5Var = obj3;
                }
                return (bz0) em5Var;
            case 11:
                zl1 zl1Var4 = (zl1) obj;
                zl1Var4.getClass();
                return ((fb2) obj2).d(zl1Var4, "bios7.bin", 65536L);
            case 12:
                zl1 zl1Var5 = (zl1) obj;
                zl1Var5.getClass();
                return ((fb2) obj2).d(zl1Var5, "bios9.bin", 65536L);
            case 13:
                zl1 zl1Var6 = (zl1) obj;
                zl1Var6.getClass();
                fb2 fb2Var2 = (fb2) obj2;
                fb2Var2.getClass();
                zl1 f3 = zl1Var6.f("firmware.bin");
                if (f3 == null) {
                    return bz0.MISSING;
                }
                try {
                    if (nb3.k(f3.j().getScheme(), "file")) {
                        String path2 = f3.j().getPath();
                        if (path2 != null) {
                            str = path2;
                        }
                        j2 = new File(str).length();
                    } else {
                        AssetFileDescriptor openAssetFileDescriptor2 = fb2Var2.b.getContentResolver().openAssetFileDescriptor(f3.j(), "r");
                        if (openAssetFileDescriptor2 != null) {
                            long length3 = openAssetFileDescriptor2.getLength();
                            openAssetFileDescriptor2.close();
                            j2 = length3;
                        } else {
                            j2 = -1;
                        }
                    }
                    if (j2 == -1) {
                        em5Var2 = bz0.MISSING;
                    } else if (j2 == 131072) {
                        em5Var2 = bz0.PRESENT;
                    } else {
                        em5Var2 = bz0.INVALID;
                    }
                } catch (Throwable th2) {
                    em5Var2 = new em5(th2);
                }
                Object obj4 = bz0.MISSING;
                if (em5Var2 instanceof em5) {
                    em5Var2 = obj4;
                }
                return (bz0) em5Var2;
            case 14:
                zl1 zl1Var7 = (zl1) obj;
                zl1Var7.getClass();
                fb2 fb2Var3 = (fb2) obj2;
                fb2Var3.getClass();
                zl1 f4 = zl1Var7.f("nand.bin");
                if (f4 == null) {
                    return bz0.MISSING;
                }
                try {
                    em5Var3 = Boolean.valueOf(f4.l());
                } catch (Throwable th3) {
                    em5Var3 = new em5(th3);
                }
                Object obj5 = Boolean.FALSE;
                if (em5Var3 instanceof em5) {
                    em5Var3 = obj5;
                }
                if (!((Boolean) em5Var3).booleanValue()) {
                    return bz0.MISSING;
                }
                try {
                    if (nb3.k(f4.j().getScheme(), "file")) {
                        String path3 = f4.j().getPath();
                        if (path3 != null) {
                            str = path3;
                        }
                        File file = new File(str);
                        if (file.exists() && file.canRead() && file.length() >= 1048576) {
                            em5Var4 = bz0.PRESENT;
                        } else if (file.exists() && file.length() < 1048576) {
                            em5Var4 = bz0.INVALID;
                        } else {
                            em5Var4 = bz0.MISSING;
                        }
                    } else {
                        ParcelFileDescriptor openFileDescriptor = fb2Var3.b.getContentResolver().openFileDescriptor(f4.j(), "r");
                        if (openFileDescriptor != null) {
                            if (openFileDescriptor.getStatSize() >= 1048576) {
                                em5Var4 = bz0.PRESENT;
                            } else {
                                em5Var4 = bz0.INVALID;
                            }
                            openFileDescriptor.close();
                            break;
                        }
                        em5Var4 = bz0.MISSING;
                    }
                } catch (Throwable th4) {
                    em5Var4 = new em5(th4);
                }
                Object obj6 = bz0.MISSING;
                if (em5Var4 instanceof em5) {
                    em5Var4 = obj6;
                }
                return (bz0) em5Var4;
            case 15:
                ki5 ki5Var = (ki5) obj;
                ki5Var.getClass();
                ((ds2) obj2).getClass();
                return Boolean.valueOf(xs6.g0(ki5Var.f, "https://github.com/ReiKatari/STORM_DS/releases/tag/", false));
            case 16:
                List<at2> list = (List) obj;
                list.getClass();
                ft2 ft2Var = (ft2) obj2;
                ft2Var.getClass();
                for (at2 at2Var : list) {
                    if (at2Var instanceof us2) {
                        ft2Var.e(null);
                    } else if (at2Var instanceof ys2) {
                        hv.L(ft2Var.X, null, a71.UNDISPATCHED, new a6((ys2) at2Var, null, 23), 1);
                    }
                }
                return jg7Var;
            case 17:
                b63 b63Var = (b63) obj;
                b63Var.getClass();
                b bVar = (b) obj2;
                bVar.getClass();
                bVar.k.l(null);
                tp6 tp6Var = bVar.i;
                tp6Var.getClass();
                tp6Var.m(null, b63Var);
                return jg7Var;
            case 18:
                b63 b63Var2 = (b63) obj;
                b63Var2.getClass();
                b bVar2 = (b) obj2;
                bVar2.getClass();
                bVar2.g(b63Var2, g63.a);
                bVar2.i.l(null);
                return jg7Var;
            case 19:
                b bVar3 = (b) obj2;
                bVar3.h(kk6.a((kk6) bVar3.g.getValue(), null, false, 0, 0, ((Boolean) obj).booleanValue(), false, RecyclerView.B1, 111));
                return jg7Var;
            case 20:
                b bVar4 = (b) obj2;
                bVar4.h(kk6.a((kk6) bVar4.g.getValue(), null, false, 0, 0, false, ((Boolean) obj).booleanValue(), RecyclerView.B1, 95));
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                b bVar5 = (b) obj2;
                bVar5.h(kk6.a((kk6) bVar5.g.getValue(), null, false, 0, 0, false, false, gi2.p(((Number) obj).floatValue(), RecyclerView.B1, 1.0f), 63));
                return jg7Var;
            case 22:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                b bVar6 = (b) obj2;
                kk6 kk6Var = (kk6) bVar6.g.getValue();
                if (booleanValue2 && kk6Var.a != null) {
                    z = true;
                } else {
                    z = false;
                }
                bVar6.h(kk6.a(kk6Var, null, z, 0, 0, false, false, RecyclerView.B1, 125));
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((Set) obj).getClass();
                zb3 zb3Var = (zb3) obj2;
                ReentrantLock reentrantLock = zb3Var.d;
                reentrantLock.lock();
                try {
                    List k1 = gt0.k1(zb3Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = k1.iterator();
                    if (!it.hasNext()) {
                        return jg7Var;
                    }
                    ((ii4) it.next()).getClass();
                    throw null;
                } catch (Throwable th5) {
                    reentrantLock.unlock();
                    throw th5;
                }
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((uc3) obj2).r((Throwable) obj);
                return jg7Var;
            case 25:
                ((m20) obj2).g((UUID) obj);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                fk3 fk3Var = (fk3) obj;
                fk3Var.getClass();
                m20 m20Var = (m20) obj2;
                m20Var.getClass();
                hv.L(to7.a(m20Var), null, null, new i20(fk3Var, m20Var, (r41) null), 3);
                return jg7Var;
            case 27:
                fk3 fk3Var2 = (fk3) obj;
                fk3Var2.getClass();
                m20 m20Var2 = (m20) obj2;
                m20Var2.getClass();
                hv.L(to7.a(m20Var2), null, null, new i20(m20Var2, fk3Var2, (r41) null), 3);
                return jg7Var;
            case 28:
                List<lh0> list2 = (List) obj;
                list2.getClass();
                ((e65) obj2).getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list2) {
                    if (((lh0) obj7) instanceof pk5) {
                        arrayList.add(obj7);
                    }
                }
                list2.removeAll(arrayList);
                for (lh0 lh0Var : gt0.a1(arrayList)) {
                    list2.add(0, lh0Var);
                }
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((lh0) listIterator.previous()) instanceof qk5) {
                            i2 = listIterator.nextIndex();
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 > 0) {
                    Object obj8 = list2.get(i2);
                    obj8.getClass();
                    qk5 qk5Var = (qk5) obj8;
                    for (int i10 = 0; i10 < i2; i10++) {
                        lh0 lh0Var2 = (lh0) list2.remove(0);
                        if (lh0Var2 instanceof rk5) {
                            tu0Var = ((rk5) lh0Var2).b;
                        } else if (lh0Var2 instanceof qk5) {
                            tu0Var = ((qk5) lh0Var2).a;
                        } else {
                            tu0Var = null;
                        }
                        if (tu0Var != null) {
                            qk5Var.a.a0(new cz1(1, tu0Var));
                        }
                        if (lh0Var2 instanceof al5) {
                            ((al5) lh0Var2).a.a(null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i11 = 0;
                for (lh0 lh0Var3 : list2) {
                    int i12 = i11 + 1;
                    if (lh0Var3 instanceof al5) {
                        al5 al5Var = (al5) lh0Var3;
                        String str3 = al5Var.a.a;
                        Set p1 = gt0.p1(gt0.U0(new xf0(str3), al5Var.b));
                        int size = list2.size();
                        for (int i13 = i12; i13 < size; i13++) {
                            lh0 lh0Var4 = (lh0) list2.get(i13);
                            if (lh0Var4 instanceof rk5) {
                                z2 = p1.contains(new xf0(((rk5) lh0Var4).a));
                            } else {
                                if (lh0Var4 instanceof al5) {
                                    al5 al5Var2 = (al5) lh0Var4;
                                    String str4 = al5Var2.a.a;
                                    Set p12 = gt0.p1(gt0.U0(new xf0(str4), al5Var2.b));
                                    if (nb3.k(str3, str4) || !p1.equals(p12)) {
                                        z2 = true;
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                valueOf = Integer.valueOf(i13);
                            }
                        }
                        valueOf = null;
                    } else {
                        if (lh0Var3 instanceof rk5) {
                            int size2 = list2.size();
                            for (int i14 = i12; i14 < size2; i14++) {
                                lh0 lh0Var5 = (lh0) list2.get(i14);
                                if ((lh0Var5 instanceof rk5) && nb3.k(((rk5) lh0Var5).a, ((rk5) lh0Var3).a)) {
                                    valueOf = Integer.valueOf(i14);
                                }
                            }
                        }
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        lh0 lh0Var6 = (lh0) list2.get(valueOf.intValue());
                        Log.d("CXCP", lh0Var3 + " is pruned by " + lh0Var6);
                        linkedHashSet.add(Integer.valueOf(i11));
                        if ((lh0Var3 instanceof rk5) && (lh0Var6 instanceof rk5)) {
                            ((rk5) lh0Var6).b.a0(new bg2((rk5) lh0Var3, 21));
                        }
                    }
                    i11 = i12;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Number number : gt0.c1(linkedHashSet)) {
                    arrayList2.add(list2.remove(number.intValue() - arrayList2.size()));
                }
                int size3 = arrayList2.size();
                while (i4 < size3) {
                    Object obj9 = arrayList2.get(i4);
                    i4++;
                    lh0 lh0Var7 = (lh0) obj9;
                    if (lh0Var7 instanceof al5) {
                        ((al5) lh0Var7).a.a(null);
                    }
                }
                return jg7Var;
            default:
                float floatValue = ((Number) obj).floatValue();
                n65 n65Var = (n65) obj2;
                rs4 rs4Var = n65Var.f;
                rs4 rs4Var2 = n65Var.g;
                if (!n65Var.b()) {
                    float h2 = rs4Var.h() + floatValue;
                    if (h2 < RecyclerView.B1) {
                        h2 = 0.0f;
                    }
                    float h3 = h2 - rs4Var.h();
                    n65Var.f.i(h2);
                    if (n65Var.a() <= rs4Var2.h()) {
                        h = n65Var.a();
                    } else {
                        float abs = Math.abs(n65Var.a() / rs4Var2.h()) - 1.0f;
                        if (abs >= RecyclerView.B1) {
                            f = abs;
                        }
                        if (f > 2.0f) {
                            f = 2.0f;
                        }
                        h = (rs4Var2.h() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) + rs4Var2.h();
                    }
                    n65Var.e.i(h);
                    f = h3;
                }
                return Float.valueOf(f);
        }
    }
}
