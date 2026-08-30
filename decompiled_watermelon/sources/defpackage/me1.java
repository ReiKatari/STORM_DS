package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Range;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: me1  reason: default package */
/* loaded from: classes.dex */
public final class me1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public me1(ArrayList arrayList, List list) {
        String str;
        Object obj;
        String concat;
        String str2;
        String str3;
        boolean a;
        this.a = 1;
        list.getClass();
        Object obj2 = jx.h;
        obj2.getClass();
        this.c = list;
        this.d = obj2;
        this.e = up1.A;
        this.f = pp1.A;
        List<f47> n1 = tq0.n1(tq0.r1(arrayList));
        this.g = n1;
        this.h = new zh0(5);
        np2 x = iq2.x();
        x.getClass();
        this.i = x;
        if (!obj2.equals(obj2)) {
            for (f47 f47Var : n1) {
                if (f47Var.f.a(b57.M)) {
                    i.i("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list2 = (List) this.f;
        Set set = (Set) this.e;
        if (!set.isEmpty() || !list2.isEmpty()) {
            Set<no2> set2 = set;
            ArrayList arrayList2 = new ArrayList(uq0.y0(set2, 10));
            for (no2 no2Var : set2) {
                arrayList2.add(no2Var.a());
            }
            for (k52 k52Var : tq0.n1(tq0.r1(arrayList2))) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : set2) {
                    if (((no2) obj3).a() == k52Var) {
                        arrayList3.add(obj3);
                    }
                }
                if (arrayList3.size() > 1) {
                    c44.u(arrayList3, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            list2.getClass();
            if (tq0.n1(tq0.r1(list2)).size() == list2.size()) {
                LinkedHashSet P0 = tq0.P0(set2, list2);
                if (P0.isEmpty()) {
                    for (f47 f47Var2 : (List) this.g) {
                        r57.Companion.getClass();
                        if (p57.a(f47Var2) != r57.UNDEFINED) {
                            if (f47Var2 instanceof nt4) {
                                str = "Preview";
                            } else if (f47Var2 instanceof zv2) {
                                str = "ImageCapture";
                            } else if (f47Var2 instanceof nv2) {
                                str = "ImageAnalysis";
                            } else if (yf2.E(f47Var2)) {
                                str = "VideoCapture";
                            } else {
                                str = "UseCase";
                            }
                            Iterator<E> it = k52.getEntries().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    r57.Companion.getClass();
                                    int i = o57.b[((k52) obj).ordinal()];
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (i != 4) {
                                                    if (i == 5) {
                                                        a = b53.x(f47Var2.f.d(b57.V, Boolean.TRUE), Boolean.FALSE);
                                                        continue;
                                                    } else {
                                                        i.c();
                                                        throw null;
                                                    }
                                                } else {
                                                    a = f47Var2.f.a(aw2.X);
                                                    continue;
                                                }
                                            } else if (!f47Var2.f.a(b57.T) && !f47Var2.f.a(b57.U)) {
                                                a = false;
                                                continue;
                                            } else {
                                                a = true;
                                                continue;
                                            }
                                        } else {
                                            a = f47Var2.f.a(b57.M);
                                            continue;
                                        }
                                    } else {
                                        a = f47Var2.f.a(fw2.n);
                                        continue;
                                    }
                                    if (a) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            k52 k52Var2 = (k52) obj;
                            if (k52Var2 != null) {
                                StringBuilder sb = new StringBuilder("A ");
                                sb.append(k52Var2.name());
                                sb.append(" value is set to ");
                                sb.append(str);
                                sb.append(" despite using feature groups. Do not use APIs like ");
                                int[] iArr = c16.a;
                                int i2 = iArr[k52Var2.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 != 4) {
                                                if (i2 == 5) {
                                                    concat = "Recorder.Builder.setQualitySelector";
                                                } else {
                                                    i.c();
                                                    throw null;
                                                }
                                            } else {
                                                concat = str.concat(".Builder.setOutputFormat");
                                            }
                                        } else if (yf2.E(f47Var2)) {
                                            concat = str.concat(".Builder.setVideoStabilizationEnabled");
                                        } else {
                                            concat = str.concat(".Builder.setPreviewStabilizationEnabled");
                                        }
                                    } else {
                                        concat = str.concat(".Builder.setTargetFrameRateRange");
                                    }
                                } else {
                                    concat = str.concat(".Builder.setDynamicRange");
                                }
                                sb.append(concat);
                                sb.append(" while using feature groups. If, for example, ");
                                int i3 = iArr[k52Var2.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                if (i3 == 5) {
                                                    str2 = "UHD recording quality";
                                                } else {
                                                    i.c();
                                                    throw null;
                                                }
                                            } else {
                                                str2 = "JPEG_R output format";
                                            }
                                        } else {
                                            str2 = "stabilization";
                                        }
                                    } else {
                                        str2 = "60 FPS";
                                    }
                                } else {
                                    str2 = "HDR";
                                }
                                sb.append(str2);
                                sb.append(" is required, instead set ");
                                int i4 = iArr[k52Var2.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 != 3) {
                                            if (i4 != 4) {
                                                if (i4 != 5) {
                                                    i.c();
                                                    throw null;
                                                }
                                                str3 = "GroupableFeatures.UHD_RECORDING";
                                            } else {
                                                str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                                            }
                                        } else {
                                            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                                        }
                                    } else {
                                        str3 = "GroupableFeature.FPS_60";
                                    }
                                } else {
                                    str3 = "GroupableFeature.HDR_HLG10";
                                }
                                i.g(b31.q(sb, str3, " as either a required or preferred feature."));
                                throw null;
                            }
                        } else {
                            f81.g(f47Var2, " is not supported with feature group");
                            throw null;
                        }
                    }
                } else {
                    c44.u(P0, "requiredFeatures and preferredFeatures have duplicate values: ");
                    throw null;
                }
            } else {
                f81.d(41, list2, "Duplicate values in preferredFeatures(");
                throw null;
            }
        }
        this.b = true;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((ou4) this.d).j();
                return null;
            }
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.c).execute(new ob0(i, 3, this, serializable));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.g) + ", frameRateRange=" + ((Range) this.d) + ", requiredFeatureGroup=" + ((Set) this.e) + ", preferredFeatureGroup=" + ((List) this.f) + ", effects=" + ((List) this.c) + ", viewPort=null}";
            default:
                return super.toString();
        }
    }

    public me1(AssetManager assetManager, Executor executor, ou4 ou4Var, String str, File file) {
        byte[] bArr;
        this.a = 0;
        this.b = false;
        this.c = executor;
        this.d = ou4Var;
        this.h = str;
        this.g = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = n40.m;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = n40.q;
                    break;
                case 26:
                    bArr = n40.p;
                    break;
                case 27:
                    bArr = n40.o;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = n40.n;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.e = bArr;
    }
}
