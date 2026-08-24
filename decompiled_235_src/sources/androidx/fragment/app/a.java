package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a extends vl2 implements jl2 {
    public final u t;
    public boolean u;
    public int v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(u uVar) {
        super(r0, r1);
        ClassLoader classLoader;
        gl2 H = uVar.H();
        cl2 cl2Var = uVar.w;
        if (cl2Var != null) {
            classLoader = cl2Var.B.getClassLoader();
        } else {
            classLoader = null;
        }
        this.v = -1;
        this.t = uVar;
    }

    @Override // defpackage.jl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (u.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.t.d.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.vl2
    public final void d(int i, o oVar, String str, int i2) {
        String str2 = oVar.mPreviousWho;
        if (str2 != null) {
            tl2.c(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = oVar.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(oVar);
                    String str4 = oVar.mTag;
                    sb.append(": was ");
                    sb.append(str4);
                    sb.append(" now ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                oVar.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = oVar.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                        sb2.append(oVar);
                        int i4 = oVar.mFragmentId;
                        sb2.append(": was ");
                        sb2.append(i4);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    oVar.mFragmentId = i;
                    oVar.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new ul2(oVar, i2));
            oVar.mFragmentManager = this.t;
            return;
        }
        defpackage.i.g(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
    }

    public final void f(int i) {
        ul2 ul2Var;
        if (this.i) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o oVar = ((ul2) arrayList.get(i2)).b;
                if (oVar != null) {
                    oVar.mBackStackNesting += i;
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + ul2Var.b + " to " + ul2Var.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ul2 ul2Var = (ul2) arrayList.get(size);
            if (ul2Var.c) {
                if (ul2Var.a == 8) {
                    ul2Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = ul2Var.b.mContainerId;
                    ul2Var.a = 2;
                    ul2Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        ul2 ul2Var2 = (ul2) arrayList.get(i2);
                        if (ul2Var2.c && ul2Var2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int h() {
        return i(false, true);
    }

    public final int i(boolean z, boolean z2) {
        if (!this.u) {
            if (u.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new qy3());
                j("  ", printWriter, true);
                printWriter.close();
            }
            this.u = true;
            boolean z3 = this.i;
            u uVar = this.t;
            if (z3) {
                this.v = uVar.k.getAndIncrement();
            } else {
                this.v = -1;
            }
            if (z2) {
                uVar.x(this, z);
            }
            return this.v;
        }
        defpackage.i.m("commit already called");
        return 0;
    }

    public final void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        ArrayList arrayList = this.c;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ul2 ul2Var = (ul2) arrayList.get(i);
                switch (ul2Var.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
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
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + ul2Var.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(ul2Var.b);
                if (z) {
                    if (ul2Var.d != 0 || ul2Var.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(ul2Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(ul2Var.e));
                    }
                    if (ul2Var.f != 0 || ul2Var.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(ul2Var.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(ul2Var.g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
