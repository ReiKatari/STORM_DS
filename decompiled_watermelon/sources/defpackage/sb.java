package defpackage;

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
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sb  reason: default package */
/* loaded from: classes.dex */
public final class sb implements d3, b43, ud7 {
    public final /* synthetic */ int A;
    public int B;
    public Object L;

    public sb(Context context, XmlResourceParser xmlResourceParser) {
        this.A = 15;
        this.B = -1;
        this.L = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.B = obtainStyledAttributes.getResourceId(index, this.B);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            te6 te6Var = null;
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
                                te6Var = new te6(context, xmlResourceParser);
                                ((SparseArray) this.L).put(te6Var.a, te6Var);
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
                                ue6 ue6Var = new ue6(context, xmlResourceParser);
                                if (te6Var != null) {
                                    te6Var.b.add(ue6Var);
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
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:23:0x008a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.sb r13, defpackage.e91 r14, defpackage.m00 r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb.g(sb, e91, m00):java.lang.Object");
    }

    public static void m(String str) {
        int i;
        boolean z;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (b53.E(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public void A(int i) {
        pb pbVar = (pb) this.L;
        pbVar.d = pbVar.a.getText(i);
    }

    public void B(View view) {
        pb pbVar = (pb) this.L;
        pbVar.u = view;
        pbVar.t = 0;
    }

    public tb C() {
        tb l = l();
        l.show();
        return l;
    }

    public int D(int i) {
        te6 te6Var;
        SparseArray sparseArray = (SparseArray) this.L;
        int i2 = 0;
        if (-1 == i) {
            if (i == -1) {
                te6Var = (te6) sparseArray.valueAt(0);
            } else {
                te6Var = (te6) sparseArray.get(-1);
            }
            if (te6Var != null) {
                ArrayList arrayList = te6Var.b;
                while (true) {
                    if (i2 < arrayList.size()) {
                        ue6 ue6Var = (ue6) arrayList.get(i2);
                        float f = ue6Var.d;
                        float f2 = ue6Var.c;
                        float f3 = ue6Var.b;
                        float f4 = ue6Var.a;
                        if ((Float.isNaN(f4) || -1.0f >= f4) && ((Float.isNaN(f3) || -1.0f >= f3) && ((Float.isNaN(f2) || -1.0f <= f2) && (Float.isNaN(f) || -1.0f <= f)))) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (-1 != i2) {
                    if (i2 == -1) {
                        return te6Var.c;
                    }
                    return ((ue6) arrayList.get(i2)).e;
                }
            }
        } else {
            te6 te6Var2 = (te6) sparseArray.get(i);
            if (te6Var2 != null) {
                ArrayList arrayList2 = te6Var2.b;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        ue6 ue6Var2 = (ue6) arrayList2.get(i2);
                        float f5 = ue6Var2.d;
                        float f6 = ue6Var2.c;
                        float f7 = ue6Var2.b;
                        float f8 = ue6Var2.a;
                        if ((Float.isNaN(f8) || -1.0f >= f8) && ((Float.isNaN(f7) || -1.0f >= f7) && ((Float.isNaN(f6) || -1.0f <= f6) && (Float.isNaN(f5) || -1.0f <= f5)))) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 == -1) {
                    return te6Var2.c;
                }
                return ((ue6) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }

    @Override // defpackage.ud7
    public synchronized pw3 a(ow3 ow3Var) {
        pw3 pw3Var;
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.L).get(ow3Var);
            pw3 pw3Var2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                k55 k55Var = (k55) arrayList.get(i);
                Bitmap bitmap = (Bitmap) k55Var.b.get();
                if (bitmap != null) {
                    pw3Var = new pw3(bitmap, k55Var.c);
                } else {
                    pw3Var = null;
                }
                if (pw3Var != null) {
                    pw3Var2 = pw3Var;
                    break;
                }
                i++;
            }
            int i2 = this.B;
            this.B = i2 + 1;
            if (i2 >= 10) {
                j();
            }
            return pw3Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ud7
    public synchronized void b(int i) {
        if (i >= 10 && i != 20) {
            j();
        }
    }

    @Override // defpackage.b43
    public void c(char c) {
        n(this.B, 1);
        int i = this.B;
        this.B = i + 1;
        ((char[]) this.L)[i] = c;
    }

    @Override // defpackage.d3
    public boolean d(View view) {
        ((BottomSheetBehavior) this.L).B(this.B);
        return true;
    }

    @Override // defpackage.b43
    public void e(String str) {
        int i;
        str.getClass();
        n(this.B, str.length() + 2);
        char[] cArr = (char[]) this.L;
        int i2 = this.B;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = xg6.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    n(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = xg6.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.L)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = xg6.a[charAt];
                                str2.getClass();
                                n(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.L, i5);
                                int length3 = str2.length() + i5;
                                this.B = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.L;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.B = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.L)[i5] = charAt;
                    }
                    i5 = i;
                }
                n(i5, 1);
                ((char[]) this.L)[i5] = '\"';
                this.B = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.B = i4 + 1;
    }

    @Override // defpackage.b43
    public void f(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        n(this.B, length);
        str.getChars(0, str.length(), (char[]) this.L, this.B);
        this.B += length;
    }

    @Override // defpackage.ud7
    public synchronized void h(ow3 ow3Var, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.L;
            Object obj = linkedHashMap.get(ow3Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(ow3Var, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            k55 k55Var = new k55(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    k55 k55Var2 = (k55) arrayList.get(i2);
                    if (i >= k55Var2.d) {
                        if (k55Var2.a == identityHashCode && k55Var2.b.get() == bitmap) {
                            arrayList.set(i2, k55Var);
                        } else {
                            arrayList.add(i2, k55Var);
                        }
                    } else {
                        i2++;
                    }
                } else {
                    arrayList.add(k55Var);
                    break;
                }
            }
            int i3 = this.B;
            this.B = i3 + 1;
            if (i3 >= 10) {
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void i(long j) {
        if (!k(j)) {
            int i = this.B;
            long[] jArr = (long[]) this.L;
            if (i >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
                this.L = jArr;
            }
            jArr[i] = j;
            if (i >= this.B) {
                this.B = i + 1;
            }
        }
    }

    public void j() {
        Bitmap bitmap;
        this.B = 0;
        Iterator it = ((LinkedHashMap) this.L).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                k55 k55Var = (k55) tq0.M0(arrayList);
                if (k55Var != null) {
                    bitmap = (Bitmap) k55Var.b.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((k55) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean k(long j) {
        int i = this.B;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.L)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public tb l() {
        int i;
        ListAdapter listAdapter;
        pb pbVar = (pb) this.L;
        ContextThemeWrapper contextThemeWrapper = pbVar.a;
        ContextThemeWrapper contextThemeWrapper2 = pbVar.a;
        tb tbVar = new tb(contextThemeWrapper, this.B);
        View view = pbVar.e;
        rb rbVar = tbVar.Z;
        if (view != null) {
            rbVar.x = view;
        } else {
            CharSequence charSequence = pbVar.d;
            if (charSequence != null) {
                rbVar.d = charSequence;
                TextView textView = rbVar.v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = pbVar.c;
            if (drawable != null) {
                rbVar.t = drawable;
                ImageView imageView = rbVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    rbVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = pbVar.f;
        if (charSequence2 != null) {
            rbVar.e = charSequence2;
            TextView textView2 = rbVar.w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = pbVar.g;
        if (charSequence3 != null) {
            rbVar.c(-1, charSequence3, pbVar.h);
        }
        CharSequence charSequence4 = pbVar.i;
        if (charSequence4 != null) {
            rbVar.c(-2, charSequence4, pbVar.j);
        }
        CharSequence charSequence5 = pbVar.k;
        if (charSequence5 != null) {
            rbVar.c(-3, charSequence5, pbVar.l);
        }
        if (pbVar.q != null || pbVar.r != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) pbVar.b.inflate(rbVar.B, (ViewGroup) null);
            if (pbVar.w) {
                listAdapter = new mb(pbVar, contextThemeWrapper2, rbVar.C, pbVar.q, alertController$RecycleListView);
            } else {
                if (pbVar.x) {
                    i = rbVar.D;
                } else {
                    i = rbVar.E;
                }
                listAdapter = pbVar.r;
                if (listAdapter == null) {
                    listAdapter = new ArrayAdapter(contextThemeWrapper2, i, 16908308, pbVar.q);
                }
            }
            rbVar.y = listAdapter;
            rbVar.z = pbVar.y;
            if (pbVar.s != null) {
                alertController$RecycleListView.setOnItemClickListener(new nb(pbVar, rbVar));
            } else if (pbVar.z != null) {
                alertController$RecycleListView.setOnItemClickListener(new ob(pbVar, alertController$RecycleListView, rbVar));
            }
            if (pbVar.x) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (pbVar.w) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            rbVar.f = alertController$RecycleListView;
        }
        View view2 = pbVar.u;
        if (view2 != null) {
            rbVar.g = view2;
            rbVar.h = 0;
            rbVar.i = false;
        } else {
            int i2 = pbVar.t;
            if (i2 != 0) {
                rbVar.g = null;
                rbVar.h = i2;
                rbVar.i = false;
            }
        }
        tbVar.setCancelable(pbVar.m);
        if (pbVar.m) {
            tbVar.setCanceledOnTouchOutside(true);
        }
        tbVar.setOnCancelListener(pbVar.n);
        tbVar.setOnDismissListener(pbVar.o);
        ww3 ww3Var = pbVar.p;
        if (ww3Var != null) {
            tbVar.setOnKeyListener(ww3Var);
        }
        return tbVar;
    }

    public void n(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.L;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.L = Arrays.copyOf(cArr, i3);
        }
    }

    public void o(int i, xv xvVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            xv xvVar2 = ((xv[]) this.L)[i2];
            xvVar2.getClass();
            if (b53.F(0L, xvVar.g - xvVar2.g) <= 0) {
                break;
            }
            xvVar2.f = i;
            ((xv[]) this.L)[i] = xvVar2;
            i = i2;
        }
        ((xv[]) this.L)[i] = xvVar;
        xvVar.f = i;
    }

    public void p(vh2 vh2Var, int i, int i2) {
        ((wd1) this.L).k(new si6(vh2Var), i, i2);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, j11, e91] */
    public k73 q() {
        k73 f83Var;
        Object obj;
        t0 t0Var = (t0) this.L;
        byte v = t0Var.v();
        if (v == 1) {
            return s(true);
        }
        if (v == 0) {
            return s(false);
        }
        if (v == 6) {
            int i = this.B + 1;
            this.B = i;
            if (i == 200) {
                w83 w83Var = new w83(this, null);
                p31 p31Var = d91.a;
                ?? obj2 = new Object();
                obj2.A = w83Var;
                obj2.B = obj2;
                p31 p31Var2 = d91.a;
                obj2.L = p31Var2;
                while (true) {
                    obj = obj2.L;
                    j11 j11Var = obj2.B;
                    if (j11Var == null) {
                        break;
                    } else if (b53.x(p31Var2, obj)) {
                        try {
                            w83 w83Var2 = obj2.A;
                            l07.q(3, w83Var2);
                            w83 w83Var3 = new w83(w83Var2.X, j11Var);
                            w83Var3.R = obj2;
                            Object v2 = w83Var3.v(o27.a);
                            if (v2 != p31.COROUTINE_SUSPENDED) {
                                j11Var.k(v2);
                            }
                        } catch (Throwable th) {
                            j11Var.k(new kc5(th));
                        }
                    } else {
                        obj2.L = p31Var2;
                        j11Var.k(obj);
                    }
                }
                me2.a0(obj);
                f83Var = (k73) obj;
            } else {
                byte h = t0Var.h((byte) 6);
                if (t0Var.v() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!t0Var.d()) {
                            break;
                        }
                        String k = t0Var.k();
                        t0Var.h((byte) 5);
                        linkedHashMap.put(k, q());
                        h = t0Var.g();
                        if (h != 4) {
                            if (h != 7) {
                                t0.q(t0Var, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (h == 6) {
                        t0Var.h((byte) 7);
                    } else if (h == 4) {
                        io2.Q(t0Var, "object");
                        throw null;
                    }
                    f83Var = new f83(linkedHashMap);
                } else {
                    t0.q(t0Var, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.B--;
            return f83Var;
        } else if (v == 8) {
            return r();
        } else {
            t0.q(t0Var, "Cannot read Json element because of unexpected ".concat(jv3.d0(v)), 0, null, 6);
            throw null;
        }
    }

    public y63 r() {
        boolean z;
        t0 t0Var = (t0) this.L;
        byte g = t0Var.g();
        if (t0Var.v() != 4) {
            ArrayList arrayList = new ArrayList();
            while (t0Var.d()) {
                arrayList.add(q());
                g = t0Var.g();
                if (g != 4) {
                    if (g == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = t0Var.B;
                    if (!z) {
                        t0.q(t0Var, "Expected end of the array or comma", i, null, 4);
                        throw null;
                    }
                }
            }
            if (g == 8) {
                t0Var.h((byte) 9);
            } else if (g == 4) {
                io2.Q(t0Var, "array");
                throw null;
            }
            return new y63(arrayList);
        }
        t0.q(t0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public k83 s(boolean z) {
        String k;
        t0 t0Var = (t0) this.L;
        if (!z) {
            k = t0Var.m();
        } else {
            k = t0Var.k();
        }
        if (!z && b53.x(k, "null")) {
            return b83.INSTANCE;
        }
        return new x73(z, k);
    }

    public void t(long j) {
        int i = this.B;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.L)[i2]) {
                int i3 = this.B - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.L;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.B--;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return new String((char[]) this.L, 0, this.B);
            default:
                return super.toString();
        }
    }

    public void u(xv xvVar) {
        xv xvVar2;
        int i = xvVar.f;
        if (i != -1) {
            int i2 = this.B;
            xv xvVar3 = ((xv[]) this.L)[i2];
            xvVar3.getClass();
            xvVar.f = -1;
            ((xv[]) this.L)[i2] = null;
            this.B = i2 - 1;
            if (xvVar == xvVar3) {
                return;
            }
            int F = b53.F(0L, xvVar3.g - xvVar.g);
            if (F == 0) {
                ((xv[]) this.L)[i] = xvVar3;
                xvVar3.f = i;
                return;
            } else if (F < 0) {
                while (true) {
                    int i3 = i << 1;
                    int i4 = i3 + 1;
                    int i5 = this.B;
                    if (i4 <= i5) {
                        xvVar2 = ((xv[]) this.L)[i3];
                        xvVar2.getClass();
                        xv xvVar4 = ((xv[]) this.L)[i4];
                        xvVar4.getClass();
                        if (b53.F(0L, xvVar4.g - xvVar2.g) >= 0) {
                            xvVar2 = xvVar4;
                        }
                    } else if (i3 > i5) {
                        break;
                    } else {
                        xvVar2 = ((xv[]) this.L)[i3];
                        xvVar2.getClass();
                    }
                    if (b53.F(0L, xvVar2.g - xvVar3.g) <= 0) {
                        break;
                    }
                    int i6 = xvVar2.f;
                    xvVar2.f = i;
                    ((xv[]) this.L)[i] = xvVar2;
                    i = i6;
                }
                ((xv[]) this.L)[i] = xvVar3;
                xvVar3.f = i;
                return;
            } else {
                o(i, xvVar3);
                return;
            }
        }
        i.i("Failed requirement.");
    }

    public void v(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        pb pbVar = (pb) this.L;
        pbVar.q = charSequenceArr;
        pbVar.s = onClickListener;
    }

    public void w(int i) {
        pb pbVar = (pb) this.L;
        pbVar.f = pbVar.a.getText(i);
    }

    @Override // defpackage.b43
    public void writeLong(long j) {
        f(String.valueOf(j));
    }

    public void x(int i, DialogInterface.OnClickListener onClickListener) {
        pb pbVar = (pb) this.L;
        pbVar.i = pbVar.a.getText(i);
        pbVar.j = onClickListener;
    }

    public void y(int i, DialogInterface.OnClickListener onClickListener) {
        pb pbVar = (pb) this.L;
        pbVar.k = pbVar.a.getText(i);
        pbVar.l = onClickListener;
    }

    public void z(int i, DialogInterface.OnClickListener onClickListener) {
        pb pbVar = (pb) this.L;
        pbVar.g = pbVar.a.getText(i);
        pbVar.h = onClickListener;
    }

    public /* synthetic */ sb(int i, int i2, Object obj) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }

    public sb(int i, ed0 ed0Var) {
        this.A = 4;
        ed0Var.getClass();
        this.B = i;
        this.L = ed0Var;
    }

    public sb(int i, byte b) {
        this.A = i;
        switch (i) {
            case 3:
                byte[][] bArr = new byte[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    bArr[i2] = new byte[614400];
                }
                this.L = bArr;
                return;
            case mj2.L /* 12 */:
                this.L = new LinkedHashMap();
                return;
            default:
                this.B = 0;
                this.L = new StringBuilder();
                return;
        }
    }

    public sb(e73 e73Var, t0 t0Var) {
        this.A = 8;
        this.L = t0Var;
    }

    public sb(int i, int i2) {
        this.A = i2;
        switch (i2) {
            case 13:
                this.B = i;
                return;
            default:
                if (i >= 1 && i <= 256) {
                    this.B = i;
                    this.L = new byte[i];
                    return;
                }
                i.i(wh1.g(i, "Invalid distance: "));
                throw null;
        }
    }

    public /* synthetic */ sb(char c, int i) {
        this.A = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sb(wd1 wd1Var, int i) {
        this(i, 13);
        this.A = 13;
        this.L = wd1Var;
    }

    public sb(ArrayList arrayList) {
        this.A = 14;
        this.L = arrayList;
    }

    public sb(Context context) {
        this.A = 0;
        int i = tb.i(context, 0);
        this.L = new pb(new ContextThemeWrapper(context, tb.i(context, i)));
        this.B = i;
    }
}
