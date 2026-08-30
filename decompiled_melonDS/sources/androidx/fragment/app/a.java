package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final z0 f1227a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f1228b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1229c;

    /* renamed from: d  reason: collision with root package name */
    public int f1230d;

    /* renamed from: e  reason: collision with root package name */
    public int f1231e;

    /* renamed from: f  reason: collision with root package name */
    public int f1232f;

    /* renamed from: g  reason: collision with root package name */
    public int f1233g;

    /* renamed from: h  reason: collision with root package name */
    public int f1234h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1235i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1236j;

    /* renamed from: k  reason: collision with root package name */
    public String f1237k;

    /* renamed from: l  reason: collision with root package name */
    public int f1238l;
    public CharSequence m;

    /* renamed from: n  reason: collision with root package name */
    public int f1239n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f1240o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f1241p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f1242q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1243r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f1244s;

    /* renamed from: t  reason: collision with root package name */
    public final g1 f1245t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1246u;

    /* renamed from: v  reason: collision with root package name */
    public int f1247v;

    public a(g1 g1Var) {
        ClassLoader classLoader;
        z0 H = g1Var.H();
        s0 s0Var = g1Var.f1331w;
        if (s0Var != null) {
            classLoader = s0Var.B.getClassLoader();
        } else {
            classLoader = null;
        }
        this.f1229c = new ArrayList();
        this.f1236j = true;
        this.f1243r = false;
        this.f1227a = H;
        this.f1228b = classLoader;
        this.f1247v = -1;
        this.f1245t = g1Var;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (g1.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1235i) {
            this.f1245t.f1313d.add(this);
            return true;
        }
        return true;
    }

    public final void b(r1 r1Var) {
        this.f1229c.add(r1Var);
        r1Var.f1408d = this.f1230d;
        r1Var.f1409e = this.f1231e;
        r1Var.f1410f = this.f1232f;
        r1Var.f1411g = this.f1233g;
    }

    public final void c(int i2) {
        r1 r1Var;
        if (this.f1235i) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f1229c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j0 j0Var = ((r1) arrayList.get(i10)).f1406b;
                if (j0Var != null) {
                    j0Var.mBackStackNesting += i2;
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r1Var.f1406b + " to " + r1Var.f1406b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f1229c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            r1 r1Var = (r1) arrayList.get(size);
            if (r1Var.f1407c) {
                if (r1Var.f1405a == 8) {
                    r1Var.f1407c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i2 = r1Var.f1406b.mContainerId;
                    r1Var.f1405a = 2;
                    r1Var.f1407c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        r1 r1Var2 = (r1) arrayList.get(i10);
                        if (r1Var2.f1407c && r1Var2.f1406b.mContainerId == i2) {
                            arrayList.remove(i10);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z10, boolean z11) {
        if (!this.f1246u) {
            if (g1.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b2());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f1246u = true;
            boolean z12 = this.f1235i;
            g1 g1Var = this.f1245t;
            if (z12) {
                this.f1247v = g1Var.f1320k.getAndIncrement();
            } else {
                this.f1247v = -1;
            }
            if (z11) {
                g1Var.x(this, z10);
            }
            return this.f1247v;
        }
        a0.j.p("commit already called");
        return 0;
    }

    public final void g(int i2, j0 j0Var, String str, int i10) {
        String str2 = j0Var.mPreviousWho;
        if (str2 != null) {
            r6.d.c(j0Var, str2);
        }
        Class<?> cls = j0Var.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = j0Var.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                    sb2.append(j0Var);
                    String str4 = j0Var.mTag;
                    sb2.append(": was ");
                    sb2.append(str4);
                    sb2.append(" now ");
                    sb2.append(str);
                    throw new IllegalStateException(sb2.toString());
                }
                j0Var.mTag = str;
            }
            if (i2 != 0) {
                if (i2 != -1) {
                    int i11 = j0Var.mFragmentId;
                    if (i11 != 0 && i11 != i2) {
                        StringBuilder sb3 = new StringBuilder("Can't change container ID of fragment ");
                        sb3.append(j0Var);
                        int i12 = j0Var.mFragmentId;
                        sb3.append(": was ");
                        sb3.append(i12);
                        sb3.append(" now ");
                        sb3.append(i2);
                        throw new IllegalStateException(sb3.toString());
                    }
                    j0Var.mFragmentId = i2;
                    j0Var.mContainerId = i2;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + j0Var + " with tag " + str + " to container view with no id");
                }
            }
            b(new r1(j0Var, i10));
            j0Var.mFragmentManager = this.f1245t;
            return;
        }
        a0.j.f(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1237k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1247v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1246u);
            if (this.f1234h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1234h));
            }
            if (this.f1230d != 0 || this.f1231e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1230d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1231e));
            }
            if (this.f1232f != 0 || this.f1233g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1232f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1233g));
            }
            if (this.f1238l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1238l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.f1239n != 0 || this.f1240o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1239n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1240o);
            }
        }
        ArrayList arrayList = this.f1229c;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                r1 r1Var = (r1) arrayList.get(i2);
                switch (r1Var.f1405a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case l1.c.f8511g /* 5 */:
                        str2 = "SHOW";
                        break;
                    case l1.c.f8509e /* 6 */:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case l1.c.f8508d /* 9 */:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case l1.c.f8510f /* 10 */:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + r1Var.f1405a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r1Var.f1406b);
                if (z10) {
                    if (r1Var.f1408d != 0 || r1Var.f1409e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r1Var.f1408d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r1Var.f1409e));
                    }
                    if (r1Var.f1410f != 0 || r1Var.f1411g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r1Var.f1410f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r1Var.f1411g));
                    }
                }
            }
        }
    }

    public final void i(int i2, j0 j0Var, String str) {
        if (i2 != 0) {
            g(i2, j0Var, str, 2);
        } else {
            a0.j.h("Must use non-zero containerViewId");
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1247v >= 0) {
            sb2.append(" #");
            sb2.append(this.f1247v);
        }
        if (this.f1237k != null) {
            sb2.append(" ");
            sb2.append(this.f1237k);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
