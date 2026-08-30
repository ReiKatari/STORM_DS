package bk;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b6.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f5.e;
import i5.v;
import i5.x;
import i5.y;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k9.f;
import l.b;
import l.c;
import l.d;
import l.g;
import n2.o1;
import nc.k;
import nc.w;
import od.d0;
import od.s;
import org.xmlpull.v1.XmlPullParserException;
import p.m;
import p7.j;
import pd.j0;
import pd.n;
import pd.t;
import pd.z;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements n, q {
    public final /* synthetic */ int A;
    public int B;
    public Object L;

    public a(Context context, XmlResourceParser xmlResourceParser) {
        this.A = 2;
        this.B = -1;
        this.L = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7009r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.B = obtainStyledAttributes.getResourceId(index, this.B);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            x xVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (!name.equals("State")) {
                                break;
                            } else {
                                xVar = new x(context, xmlResourceParser);
                                ((SparseArray) this.L).put(xVar.f7016a, xVar);
                                continue;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            continue;
                        case 1382829617:
                            name.equals("StateSet");
                            continue;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                y yVar = new y(context, xmlResourceParser);
                                if (xVar != null) {
                                    xVar.f7017b.add(yVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e6) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e6);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0087 -> B:23:0x008b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(bk.a r13, yb.b r14, ec.a r15) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.a.e(bk.a, yb.b, ec.a):java.lang.Object");
    }

    public static void j(String str) {
        int i2;
        boolean z10;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                if (!z11) {
                    i2 = i10;
                } else {
                    i2 = length;
                }
                if (k.b(str.charAt(i2), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i10++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e6) {
                    Log.w("SupportSQLite", "delete failed: ", e6);
                }
            }
        }
    }

    @Override // pd.n
    public void a(char c4) {
        k(this.B, 1);
        int i2 = this.B;
        this.B = i2 + 1;
        ((char[]) this.L)[i2] = c4;
    }

    @Override // pd.n
    public void b(String str) {
        int i2;
        str.getClass();
        k(this.B, str.length() + 2);
        char[] cArr = (char[]) this.L;
        int i10 = this.B;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c4 = cArr[i13];
            byte[] bArr = j0.f11592b;
            if (c4 < bArr.length && bArr[c4] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    k(i13, 2);
                    char charAt = str.charAt(i14);
                    byte[] bArr2 = j0.f11592b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i2 = i13 + 1;
                            ((char[]) this.L)[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str2 = j0.f11591a[charAt];
                                str2.getClass();
                                k(i13, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.L, i13);
                                int length3 = str2.length() + i13;
                                this.B = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.L;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                this.B = i13;
                            }
                        }
                    } else {
                        i2 = i13 + 1;
                        ((char[]) this.L)[i13] = charAt;
                    }
                    i13 = i2;
                }
                k(i13, 1);
                ((char[]) this.L)[i13] = '\"';
                this.B = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        this.B = i12 + 1;
    }

    @Override // b6.q
    public boolean c(View view) {
        ((BottomSheetBehavior) this.L).B(this.B);
        return true;
    }

    @Override // pd.n
    public void d(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        k(this.B, length);
        str.getChars(0, str.length(), (char[]) this.L, this.B);
        this.B += length;
    }

    public void f(long j2) {
        if (!h(j2)) {
            int i2 = this.B;
            long[] jArr = (long[]) this.L;
            if (i2 >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i2 + 1, jArr.length * 2));
                this.L = jArr;
            }
            jArr[i2] = j2;
            if (i2 >= this.B) {
                this.B = i2 + 1;
            }
        }
    }

    public void g() {
        Bitmap bitmap;
        this.B = 0;
        Iterator it = ((LinkedHashMap) this.L).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                f fVar = (f) l.T(arrayList);
                if (fVar != null) {
                    bitmap = (Bitmap) fVar.f8104b.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i2 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = i10 - i2;
                    if (((f) arrayList.get(i11)).f8104b.get() == null) {
                        arrayList.remove(i11);
                        i2++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean h(long j2) {
        int i2 = this.B;
        for (int i10 = 0; i10 < i2; i10++) {
            if (((long[]) this.L)[i10] == j2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.widget.ListAdapter] */
    public g i() {
        int i2;
        l.a aVar;
        d dVar = (d) this.L;
        ContextThemeWrapper contextThemeWrapper = dVar.f8356a;
        ContextThemeWrapper contextThemeWrapper2 = dVar.f8356a;
        g gVar = new g(contextThemeWrapper, this.B);
        View view = dVar.f8360e;
        l.f fVar = gVar.Z;
        if (view != null) {
            fVar.f8410x = view;
        } else {
            CharSequence charSequence = dVar.f8359d;
            if (charSequence != null) {
                fVar.f8391d = charSequence;
                TextView textView = fVar.f8408v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f8358c;
            if (drawable != null) {
                fVar.f8406t = drawable;
                ImageView imageView = fVar.f8407u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f8407u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f8361f;
        if (charSequence2 != null) {
            fVar.f8392e = charSequence2;
            TextView textView2 = fVar.f8409w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dVar.f8362g;
        if (charSequence3 != null) {
            fVar.c(-1, charSequence3, dVar.f8363h);
        }
        CharSequence charSequence4 = dVar.f8364i;
        if (charSequence4 != null) {
            fVar.c(-2, charSequence4, dVar.f8365j);
        }
        CharSequence charSequence5 = dVar.f8366k;
        if (charSequence5 != null) {
            fVar.c(-3, charSequence5, dVar.f8367l);
        }
        if (dVar.f8371q != null || dVar.f8372r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f8357b.inflate(fVar.B, (ViewGroup) null);
            if (dVar.f8377w) {
                aVar = new l.a(dVar, contextThemeWrapper2, fVar.C, dVar.f8371q, alertController$RecycleListView);
            } else {
                if (dVar.f8378x) {
                    i2 = fVar.D;
                } else {
                    i2 = fVar.E;
                }
                Object obj = dVar.f8372r;
                aVar = obj;
                if (obj == null) {
                    aVar = new ArrayAdapter(contextThemeWrapper2, i2, 16908308, dVar.f8371q);
                }
            }
            fVar.f8411y = aVar;
            fVar.f8412z = dVar.f8379y;
            if (dVar.f8373s != null) {
                alertController$RecycleListView.setOnItemClickListener(new b(dVar, fVar));
            } else if (dVar.f8380z != null) {
                alertController$RecycleListView.setOnItemClickListener(new c(dVar, alertController$RecycleListView, fVar));
            }
            if (dVar.f8378x) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (dVar.f8377w) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            fVar.f8393f = alertController$RecycleListView;
        }
        View view2 = dVar.f8375u;
        if (view2 != null) {
            fVar.f8394g = view2;
            fVar.f8395h = 0;
            fVar.f8396i = false;
        } else {
            int i10 = dVar.f8374t;
            if (i10 != 0) {
                fVar.f8394g = null;
                fVar.f8395h = i10;
                fVar.f8396i = false;
            }
        }
        gVar.setCancelable(dVar.m);
        if (dVar.m) {
            gVar.setCanceledOnTouchOutside(true);
        }
        gVar.setOnCancelListener(dVar.f8368n);
        gVar.setOnDismissListener(dVar.f8369o);
        m mVar = dVar.f8370p;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    public void k(int i2, int i10) {
        int i11 = i10 + i2;
        char[] cArr = (char[]) this.L;
        if (cArr.length <= i11) {
            int i12 = i2 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            this.L = Arrays.copyOf(cArr, i11);
        }
    }

    public void l(int i2, fj.b bVar) {
        while (true) {
            int i10 = i2 >> 1;
            if (i10 == 0) {
                break;
            }
            fj.b bVar2 = ((fj.b[]) this.L)[i10];
            bVar2.getClass();
            if (k.c(0L, bVar.f4975g - bVar2.f4975g) <= 0) {
                break;
            }
            bVar2.f4974f = i2;
            ((fj.b[]) this.L)[i2] = bVar2;
            i2 = i10;
        }
        ((fj.b[]) this.L)[i2] = bVar;
        bVar.f4974f = i2;
    }

    public void m(v7.b bVar, int i2, int i10) {
        ((e) this.L).k(new w7.a(bVar), i2, i10);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [yb.b, java.lang.Object, cc.c] */
    public od.l n() {
        od.l zVar;
        Object obj;
        pd.a aVar = (pd.a) this.L;
        byte u4 = aVar.u();
        if (u4 == 1) {
            return p(true);
        }
        if (u4 == 0) {
            return p(false);
        }
        if (u4 == 6) {
            int i2 = this.B + 1;
            this.B = i2;
            if (i2 == 200) {
                z zVar2 = new z(this, null);
                dc.a aVar2 = yb.a.f14810a;
                ?? obj2 = new Object();
                obj2.A = zVar2;
                obj2.B = obj2;
                dc.a aVar3 = yb.a.f14810a;
                obj2.L = aVar3;
                while (true) {
                    obj = obj2.L;
                    cc.c cVar = obj2.B;
                    if (cVar == null) {
                        break;
                    } else if (k.a(aVar3, obj)) {
                        try {
                            z zVar3 = obj2.A;
                            w.b(3, zVar3);
                            z zVar4 = new z(zVar3.X, cVar);
                            zVar4.R = obj2;
                            Object v10 = zVar4.v(yb.y.f14813a);
                            if (v10 != dc.a.COROUTINE_SUSPENDED) {
                                cVar.h(v10);
                            }
                        } catch (Throwable th2) {
                            cVar.h(new yb.k(th2));
                        }
                    } else {
                        obj2.L = aVar3;
                        cVar.h(obj);
                    }
                }
                j.I(obj);
                zVar = (od.l) obj;
            } else {
                byte g10 = aVar.g((byte) 6);
                if (aVar.u() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!aVar.c()) {
                            break;
                        }
                        String j2 = aVar.j();
                        aVar.g((byte) 5);
                        linkedHashMap.put(j2, n());
                        g10 = aVar.f();
                        if (g10 != 4) {
                            if (g10 != 7) {
                                pd.a.p(aVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (g10 == 6) {
                        aVar.g((byte) 7);
                    } else if (g10 == 4) {
                        t.m(aVar, "object");
                        throw null;
                    }
                    zVar = new od.z(linkedHashMap);
                } else {
                    pd.a.p(aVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.B--;
            return zVar;
        } else if (u4 == 8) {
            return o();
        } else {
            pd.a.p(aVar, "Cannot read Json element because of unexpected ".concat(t.s(u4)), 0, null, 6);
            throw null;
        }
    }

    public od.e o() {
        boolean z10;
        pd.a aVar = (pd.a) this.L;
        byte f8 = aVar.f();
        if (aVar.u() != 4) {
            ArrayList arrayList = new ArrayList();
            while (aVar.c()) {
                arrayList.add(n());
                f8 = aVar.f();
                if (f8 != 4) {
                    if (f8 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i2 = aVar.f11551a;
                    if (!z10) {
                        pd.a.p(aVar, "Expected end of the array or comma", i2, null, 4);
                        throw null;
                    }
                }
            }
            if (f8 == 8) {
                aVar.g((byte) 9);
            } else if (f8 == 4) {
                t.m(aVar, "array");
                throw null;
            }
            return new od.e(arrayList);
        }
        pd.a.p(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public d0 p(boolean z10) {
        String j2;
        pd.a aVar = (pd.a) this.L;
        if (!z10) {
            j2 = aVar.l();
        } else {
            j2 = aVar.j();
        }
        if (!z10 && k.a(j2, "null")) {
            return od.v.INSTANCE;
        }
        return new s(z10, j2);
    }

    public void q(long j2) {
        int i2 = this.B;
        int i10 = 0;
        while (i10 < i2) {
            if (j2 == ((long[]) this.L)[i10]) {
                int i11 = this.B - 1;
                while (i10 < i11) {
                    long[] jArr = (long[]) this.L;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.B--;
                return;
            }
            i10++;
        }
    }

    public void r(fj.b bVar) {
        fj.b bVar2;
        int i2 = bVar.f4974f;
        if (i2 != -1) {
            int i10 = this.B;
            fj.b bVar3 = ((fj.b[]) this.L)[i10];
            bVar3.getClass();
            bVar.f4974f = -1;
            ((fj.b[]) this.L)[i10] = null;
            this.B = i10 - 1;
            if (bVar == bVar3) {
                return;
            }
            int c4 = k.c(0L, bVar3.f4975g - bVar.f4975g);
            if (c4 == 0) {
                ((fj.b[]) this.L)[i2] = bVar3;
                bVar3.f4974f = i2;
                return;
            } else if (c4 < 0) {
                while (true) {
                    int i11 = i2 << 1;
                    int i12 = i11 + 1;
                    int i13 = this.B;
                    if (i12 <= i13) {
                        bVar2 = ((fj.b[]) this.L)[i11];
                        bVar2.getClass();
                        fj.b bVar4 = ((fj.b[]) this.L)[i12];
                        bVar4.getClass();
                        if (k.c(0L, bVar4.f4975g - bVar2.f4975g) >= 0) {
                            bVar2 = bVar4;
                        }
                    } else if (i11 > i13) {
                        break;
                    } else {
                        bVar2 = ((fj.b[]) this.L)[i11];
                        bVar2.getClass();
                    }
                    if (k.c(0L, bVar2.f4975g - bVar3.f4975g) <= 0) {
                        break;
                    }
                    int i14 = bVar2.f4974f;
                    bVar2.f4974f = i2;
                    ((fj.b[]) this.L)[i2] = bVar2;
                    i2 = i14;
                }
                ((fj.b[]) this.L)[i2] = bVar3;
                bVar3.f4974f = i2;
                return;
            } else {
                l(i2, bVar3);
                return;
            }
        }
        a0.j.h("Failed requirement.");
    }

    public synchronized void s(k9.a aVar, Bitmap bitmap, Map map, int i2) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.L;
            Object obj = linkedHashMap.get(aVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(aVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            f fVar = new f(identityHashCode, new WeakReference(bitmap), map, i2);
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    f fVar2 = (f) arrayList.get(i10);
                    if (i2 >= fVar2.f8106d) {
                        if (fVar2.f8103a == identityHashCode && fVar2.f8104b.get() == bitmap) {
                            arrayList.set(i10, fVar);
                        } else {
                            arrayList.add(i10, fVar);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    arrayList.add(fVar);
                    break;
                }
            }
            int i11 = this.B;
            this.B = i11 + 1;
            if (i11 >= 10) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void t(int i2) {
        d dVar = (d) this.L;
        dVar.f8361f = dVar.f8356a.getText(i2);
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return new String((char[]) this.L, 0, this.B);
            default:
                return super.toString();
        }
    }

    public void u(int i2, DialogInterface.OnClickListener onClickListener) {
        d dVar = (d) this.L;
        dVar.f8364i = dVar.f8356a.getText(i2);
        dVar.f8365j = onClickListener;
    }

    public void v(int i2, DialogInterface.OnClickListener onClickListener) {
        d dVar = (d) this.L;
        dVar.f8362g = dVar.f8356a.getText(i2);
        dVar.f8363h = onClickListener;
    }

    public void w(int i2) {
        d dVar = (d) this.L;
        dVar.f8359d = dVar.f8356a.getText(i2);
    }

    @Override // pd.n
    public void writeLong(long j2) {
        d(String.valueOf(j2));
    }

    public void x(View view) {
        d dVar = (d) this.L;
        dVar.f8375u = view;
        dVar.f8374t = 0;
    }

    public g y() {
        g i2 = i();
        i2.show();
        return i2;
    }

    public int z(int i2) {
        x xVar;
        float f8 = -1;
        SparseArray sparseArray = (SparseArray) this.L;
        int i10 = 0;
        if (-1 == i2) {
            if (i2 == -1) {
                xVar = (x) sparseArray.valueAt(0);
            } else {
                xVar = (x) sparseArray.get(-1);
            }
            if (xVar != null) {
                ArrayList arrayList = xVar.f7017b;
                while (true) {
                    if (i10 < arrayList.size()) {
                        if (((y) arrayList.get(i10)).a(f8, f8)) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (-1 != i10) {
                    if (i10 == -1) {
                        return xVar.f7018c;
                    }
                    return ((y) arrayList.get(i10)).f7023e;
                }
            }
        } else {
            x xVar2 = (x) sparseArray.get(i2);
            if (xVar2 != null) {
                ArrayList arrayList2 = xVar2.f7017b;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        if (((y) arrayList2.get(i10)).a(f8, f8)) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    return xVar2.f7018c;
                }
                return ((y) arrayList2.get(i10)).f7023e;
            }
        }
        return -1;
    }

    public /* synthetic */ a(int i2, int i10, Object obj) {
        this.A = i10;
        this.L = obj;
        this.B = i2;
    }

    public a(o1 o1Var, pd.a aVar) {
        this.A = 8;
        this.L = aVar;
    }

    public a(int i2, int i10) {
        this.A = i10;
        switch (i10) {
            case 3:
                this.B = i2;
                return;
            default:
                if (i2 >= 1 && i2 <= 256) {
                    this.B = i2;
                    this.L = new byte[i2];
                    return;
                }
                a0.j.h(w.d.l(i2, "Invalid distance: "));
                throw null;
        }
    }

    public a(int i2, byte b10) {
        this.A = i2;
        switch (i2) {
            case l1.c.f8509e /* 6 */:
                byte[][] bArr = new byte[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    bArr[i10] = new byte[614400];
                }
                this.L = bArr;
                return;
            case l1.c.f8510f /* 10 */:
                this.B = 0;
                this.L = new StringBuilder();
                return;
            default:
                this.L = new LinkedHashMap();
                return;
        }
    }

    public /* synthetic */ a(char c4, int i2) {
        this.A = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i2) {
        this(i2, 3);
        this.A = 3;
        this.L = eVar;
    }

    public a(Context context) {
        this.A = 5;
        int h2 = g.h(context, 0);
        this.L = new d(new ContextThemeWrapper(context, g.h(context, h2)));
        this.B = h2;
    }
}
