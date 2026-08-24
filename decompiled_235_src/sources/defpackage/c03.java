package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c03  reason: default package */
/* loaded from: classes.dex */
public abstract class c03 {
    public final vk5 a;
    public final xk4 b;
    public final b51 c;

    public c03(vk5 vk5Var, xk4 xk4Var, b51 b51Var) {
        this.a = vk5Var;
        this.b = xk4Var;
        this.c = b51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:386:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c03 b(pa paVar, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        Type[] genericParameterTypes;
        boolean z3;
        boolean z4;
        int i;
        uj2 uj2Var;
        int i2;
        int i3;
        uj2[] uj2VarArr;
        int i4;
        int i5;
        String str;
        uj2 uj2Var2;
        uj2 ks4Var;
        fs4 fs4Var;
        fs4 fs4Var2;
        String str2;
        uk5 uk5Var = new uk5(paVar, method);
        Annotation[] annotationArr = uk5Var.c;
        int length = annotationArr.length;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            boolean z5 = true;
            uj2 uj2Var3 = null;
            if (i7 < length) {
                Annotation annotation = annotationArr[i7];
                if (annotation instanceof z81) {
                    uk5Var.b("DELETE", ((z81) annotation).value(), false);
                } else if (annotation instanceof vo2) {
                    uk5Var.b("GET", ((vo2) annotation).value(), false);
                } else if (annotation instanceof dv2) {
                    uk5Var.b("HEAD", ((dv2) annotation).value(), false);
                } else if (annotation instanceof cq4) {
                    uk5Var.b("PATCH", ((cq4) annotation).value(), true);
                } else if (annotation instanceof dq4) {
                    uk5Var.b("POST", ((dq4) annotation).value(), true);
                } else if (annotation instanceof eq4) {
                    uk5Var.b("PUT", ((eq4) annotation).value(), true);
                } else if (annotation instanceof oh4) {
                    uk5Var.b("OPTIONS", ((oh4) annotation).value(), false);
                } else if (annotation instanceof ev2) {
                    ev2 ev2Var = (ev2) annotation;
                    uk5Var.b(ev2Var.method(), ev2Var.path(), ev2Var.hasBody());
                } else if (annotation instanceof xw2) {
                    xw2 xw2Var = (xw2) annotation;
                    String[] value = xw2Var.value();
                    if (value.length != 0) {
                        boolean allowUnsafeNonAsciiValues = xw2Var.allowUnsafeNonAsciiValues();
                        ww2 ww2Var = new ww2(0, (byte) 0);
                        int length2 = value.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            str2 = value[i8];
                            int indexOf = str2.indexOf(58);
                            boolean z6 = z5;
                            if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                                break loop0;
                            }
                            String substring = str2.substring(0, indexOf);
                            String trim = str2.substring(indexOf + 1).trim();
                            if ("Content-Type".equalsIgnoreCase(substring)) {
                                try {
                                    xh5 xh5Var = n34.d;
                                    uk5Var.t = xk2.k(trim);
                                } catch (IllegalArgumentException e) {
                                    throw ak7.o0(method, e, "Malformed content type: %s", trim);
                                }
                            } else if (allowUnsafeNonAsciiValues) {
                                ww2Var.e(substring, trim);
                            } else {
                                ww2Var.b(substring, trim);
                            }
                            i8++;
                            z5 = z6;
                        }
                        uk5Var.s = ww2Var.f();
                    } else {
                        throw ak7.o0(method, null, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof j94) {
                    if (!uk5Var.p) {
                        uk5Var.q = true;
                    } else {
                        throw ak7.o0(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (!(annotation instanceof bk2)) {
                    continue;
                } else if (!uk5Var.q) {
                    uk5Var.p = true;
                } else {
                    throw ak7.o0(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                i7++;
            } else if (uk5Var.n != null) {
                if (!uk5Var.o) {
                    if (!uk5Var.q) {
                        if (uk5Var.p) {
                            throw ak7.o0(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw ak7.o0(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = uk5Var.d;
                int length3 = annotationArr2.length;
                uk5Var.v = new uj2[length3];
                int i9 = length3 - 1;
                int i10 = 0;
                while (i10 < length3) {
                    uj2[] uj2VarArr2 = uk5Var.v;
                    Type type = uk5Var.e[i10];
                    Annotation[] annotationArr3 = annotationArr2[i10];
                    if (i10 == i9) {
                        i = 1;
                    } else {
                        i = i6;
                    }
                    if (annotationArr3 != null) {
                        int length4 = annotationArr3.length;
                        uj2Var = uj2Var3;
                        int i11 = i6;
                        while (i11 < length4) {
                            Annotation annotation2 = annotationArr3[i11];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i12 = length3;
                            if (annotation2 instanceof yh7) {
                                uk5Var.c(i10, type);
                                if (!uk5Var.m) {
                                    if (!uk5Var.i) {
                                        if (!uk5Var.j) {
                                            if (!uk5Var.k) {
                                                if (!uk5Var.l) {
                                                    if (uk5Var.r == null) {
                                                        uk5Var.m = true;
                                                        if (type != i03.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                                            throw ak7.v0(method, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                                        }
                                                        uj2Var2 = new js4(method, i10, 1);
                                                        str = str3;
                                                        i2 = i9;
                                                    } else {
                                                        throw ak7.v0(method, i10, "@Url cannot be used with @%s URL", uk5Var.n);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                                }
                                            } else {
                                                throw ak7.v0(method, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                            }
                                        } else {
                                            throw ak7.v0(method, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                                        }
                                    } else {
                                        throw ak7.v0(method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                } else {
                                    throw ak7.v0(method, i10, "Multiple @Url method annotations found.", new Object[0]);
                                }
                            } else {
                                i2 = i9;
                                boolean z7 = annotation2 instanceof mt4;
                                pa paVar2 = uk5Var.a;
                                if (z7) {
                                    uk5Var.c(i10, type);
                                    if (!uk5Var.j) {
                                        if (!uk5Var.k) {
                                            if (!uk5Var.l) {
                                                if (!uk5Var.m) {
                                                    if (uk5Var.r != null) {
                                                        uk5Var.i = true;
                                                        mt4 mt4Var = (mt4) annotation2;
                                                        String value2 = mt4Var.value();
                                                        if (uk5.y.matcher(value2).matches()) {
                                                            if (uk5Var.u.contains(value2)) {
                                                                paVar2.v(type, annotationArr3);
                                                                uj2Var2 = new ls4(uk5Var.b, i10, value2, mt4Var.encoded());
                                                                str = str3;
                                                            } else {
                                                                throw ak7.v0(method, i10, "URL \"%s\" does not contain \"{%s}\".", uk5Var.r, value2);
                                                            }
                                                        } else {
                                                            throw ak7.v0(method, i10, "@Path parameter name must match %s. Found: %s", uk5.x.pattern(), value2);
                                                        }
                                                    } else {
                                                        throw ak7.v0(method, i10, "@Path can only be used with relative url on @%s", uk5Var.n);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                                                }
                                            } else {
                                                throw ak7.v0(method, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                            }
                                        } else {
                                            throw ak7.v0(method, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                        }
                                    } else {
                                        throw ak7.v0(method, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                } else {
                                    i3 = i11;
                                    uj2VarArr = uj2VarArr2;
                                    if (annotation2 instanceof r65) {
                                        uk5Var.c(i10, type);
                                        r65 r65Var = (r65) annotation2;
                                        String value3 = r65Var.value();
                                        boolean encoded = r65Var.encoded();
                                        i4 = i;
                                        Class c0 = ak7.c0(type);
                                        i5 = length4;
                                        uk5Var.j = true;
                                        if (Iterable.class.isAssignableFrom(c0)) {
                                            if (type instanceof ParameterizedType) {
                                                paVar2.v(ak7.Y(0, (ParameterizedType) type), annotationArr3);
                                                fs4Var2 = new fs4(new hs4(value3, 2, encoded), 0);
                                            } else {
                                                throw ak7.v0(method, i10, c0.getSimpleName() + " must include generic type (e.g., " + c0.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                        } else if (c0.isArray()) {
                                            paVar2.v(uk5.a(c0.getComponentType()), annotationArr3);
                                            fs4Var2 = new fs4(new hs4(value3, 2, encoded), 1);
                                        } else {
                                            paVar2.v(type, annotationArr3);
                                            uj2Var2 = new hs4(value3, 2, encoded);
                                            str = str3;
                                        }
                                        uj2Var2 = fs4Var2;
                                        str = str3;
                                    } else {
                                        i4 = i;
                                        i5 = length4;
                                        if (annotation2 instanceof t65) {
                                            uk5Var.c(i10, type);
                                            boolean encoded2 = ((t65) annotation2).encoded();
                                            Class c02 = ak7.c0(type);
                                            uk5Var.k = true;
                                            if (Iterable.class.isAssignableFrom(c02)) {
                                                if (type instanceof ParameterizedType) {
                                                    paVar2.v(ak7.Y(0, (ParameterizedType) type), annotationArr3);
                                                    fs4Var2 = new fs4(new ms4(encoded2), 0);
                                                } else {
                                                    throw ak7.v0(method, i10, c02.getSimpleName() + " must include generic type (e.g., " + c02.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                            } else if (c02.isArray()) {
                                                paVar2.v(uk5.a(c02.getComponentType()), annotationArr3);
                                                fs4Var2 = new fs4(new ms4(encoded2), 1);
                                            } else {
                                                paVar2.v(type, annotationArr3);
                                                uj2Var2 = new ms4(encoded2);
                                            }
                                            uj2Var2 = fs4Var2;
                                        } else if (annotation2 instanceof s65) {
                                            uk5Var.c(i10, type);
                                            Class c03 = ak7.c0(type);
                                            uk5Var.l = true;
                                            if (Map.class.isAssignableFrom(c03)) {
                                                Type e0 = ak7.e0(type, c03);
                                                if (e0 instanceof ParameterizedType) {
                                                    ParameterizedType parameterizedType = (ParameterizedType) e0;
                                                    Type Y = ak7.Y(0, parameterizedType);
                                                    if (String.class == Y) {
                                                        paVar2.v(ak7.Y(1, parameterizedType), annotationArr3);
                                                        uj2Var2 = new is4(method, i10, ((s65) annotation2).encoded(), 2);
                                                    } else {
                                                        throw ak7.v0(method, i10, "@QueryMap keys must be of type String: " + Y, new Object[0]);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                            } else {
                                                throw ak7.v0(method, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                        } else {
                                            str = str3;
                                            if (annotation2 instanceof tw2) {
                                                uk5Var.c(i10, type);
                                                tw2 tw2Var = (tw2) annotation2;
                                                String value4 = tw2Var.value();
                                                Class c04 = ak7.c0(type);
                                                if (Iterable.class.isAssignableFrom(c04)) {
                                                    if (type instanceof ParameterizedType) {
                                                        paVar2.v(ak7.Y(0, (ParameterizedType) type), annotationArr3);
                                                        ks4Var = new fs4(new hs4(value4, 1, tw2Var.allowUnsafeNonAsciiValues()), 0);
                                                    } else {
                                                        throw ak7.v0(method, i10, c04.getSimpleName() + " must include generic type (e.g., " + c04.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                } else if (c04.isArray()) {
                                                    paVar2.v(uk5.a(c04.getComponentType()), annotationArr3);
                                                    ks4Var = new fs4(new hs4(value4, 1, tw2Var.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    paVar2.v(type, annotationArr3);
                                                    uj2Var2 = new hs4(value4, 1, tw2Var.allowUnsafeNonAsciiValues());
                                                }
                                                uj2Var2 = ks4Var;
                                            } else if (annotation2 instanceof vw2) {
                                                if (type == yw2.class) {
                                                    uj2Var2 = new js4(method, i10, 0);
                                                } else {
                                                    uk5Var.c(i10, type);
                                                    Class c05 = ak7.c0(type);
                                                    if (Map.class.isAssignableFrom(c05)) {
                                                        Type e02 = ak7.e0(type, c05);
                                                        if (e02 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) e02;
                                                            Type Y2 = ak7.Y(0, parameterizedType2);
                                                            if (String.class == Y2) {
                                                                paVar2.v(ak7.Y(1, parameterizedType2), annotationArr3);
                                                                uj2Var2 = new is4(method, i10, ((vw2) annotation2).allowUnsafeNonAsciiValues(), 1);
                                                            } else {
                                                                throw ak7.v0(method, i10, "@HeaderMap keys must be of type String: " + Y2, new Object[0]);
                                                            }
                                                        } else {
                                                            throw ak7.v0(method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw ak7.v0(method, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                }
                                            } else if (annotation2 instanceof ma2) {
                                                uk5Var.c(i10, type);
                                                if (uk5Var.p) {
                                                    ma2 ma2Var = (ma2) annotation2;
                                                    String value5 = ma2Var.value();
                                                    boolean encoded3 = ma2Var.encoded();
                                                    uk5Var.f = true;
                                                    Class c06 = ak7.c0(type);
                                                    if (Iterable.class.isAssignableFrom(c06)) {
                                                        if (type instanceof ParameterizedType) {
                                                            paVar2.v(ak7.Y(0, (ParameterizedType) type), annotationArr3);
                                                            ks4Var = new fs4(new hs4(value5, 0, encoded3), 0);
                                                        } else {
                                                            throw ak7.v0(method, i10, c06.getSimpleName() + " must include generic type (e.g., " + c06.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                    } else if (c06.isArray()) {
                                                        paVar2.v(uk5.a(c06.getComponentType()), annotationArr3);
                                                        ks4Var = new fs4(new hs4(value5, 0, encoded3), 1);
                                                    } else {
                                                        paVar2.v(type, annotationArr3);
                                                        uj2Var2 = new hs4(value5, 0, encoded3);
                                                    }
                                                    uj2Var2 = ks4Var;
                                                } else {
                                                    throw ak7.v0(method, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof oa2) {
                                                uk5Var.c(i10, type);
                                                if (uk5Var.p) {
                                                    Class c07 = ak7.c0(type);
                                                    if (Map.class.isAssignableFrom(c07)) {
                                                        Type e03 = ak7.e0(type, c07);
                                                        if (e03 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType3 = (ParameterizedType) e03;
                                                            Type Y3 = ak7.Y(0, parameterizedType3);
                                                            if (String.class == Y3) {
                                                                paVar2.v(ak7.Y(1, parameterizedType3), annotationArr3);
                                                                uk5Var.f = true;
                                                                uj2Var2 = new is4(method, i10, ((oa2) annotation2).encoded(), 0);
                                                            } else {
                                                                throw ak7.v0(method, i10, "@FieldMap keys must be of type String: " + Y3, new Object[0]);
                                                            }
                                                        } else {
                                                            throw ak7.v0(method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw ak7.v0(method, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof zs4) {
                                                uk5Var.c(i10, type);
                                                if (uk5Var.q) {
                                                    zs4 zs4Var = (zs4) annotation2;
                                                    uk5Var.g = true;
                                                    String value6 = zs4Var.value();
                                                    Class c08 = ak7.c0(type);
                                                    if (value6.isEmpty()) {
                                                        boolean isAssignableFrom = Iterable.class.isAssignableFrom(c08);
                                                        ns4 ns4Var = ns4.h;
                                                        if (isAssignableFrom) {
                                                            if (type instanceof ParameterizedType) {
                                                                if (k94.class.isAssignableFrom(ak7.c0(ak7.Y(0, (ParameterizedType) type)))) {
                                                                    uj2Var2 = new fs4(ns4Var, 0);
                                                                } else {
                                                                    throw ak7.v0(method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw ak7.v0(method, i10, c08.getSimpleName() + " must include generic type (e.g., " + c08.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                        } else if (c08.isArray()) {
                                                            if (k94.class.isAssignableFrom(c08.getComponentType())) {
                                                                uj2Var2 = new fs4(ns4Var, 1);
                                                            } else {
                                                                throw ak7.v0(method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                        } else if (k94.class.isAssignableFrom(c08)) {
                                                            uj2Var2 = ns4Var;
                                                        } else {
                                                            throw ak7.v0(method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                    } else {
                                                        String[] strArr = {"Content-Disposition", lb1.A("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", zs4Var.encoding()};
                                                        yw2 yw2Var = yw2.B;
                                                        yw2 R = ln2.R(strArr);
                                                        if (Iterable.class.isAssignableFrom(c08)) {
                                                            if (type instanceof ParameterizedType) {
                                                                Type Y4 = ak7.Y(0, (ParameterizedType) type);
                                                                if (!k94.class.isAssignableFrom(ak7.c0(Y4))) {
                                                                    fs4Var = new fs4(new ks4(method, i10, R, paVar2.s(Y4, annotationArr3, annotationArr)), 0);
                                                                } else {
                                                                    throw ak7.v0(method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw ak7.v0(method, i10, c08.getSimpleName() + " must include generic type (e.g., " + c08.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                        } else if (c08.isArray()) {
                                                            Class a = uk5.a(c08.getComponentType());
                                                            if (!k94.class.isAssignableFrom(a)) {
                                                                fs4Var = new fs4(new ks4(method, i10, R, paVar2.s(a, annotationArr3, annotationArr)), 1);
                                                            } else {
                                                                throw ak7.v0(method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else if (!k94.class.isAssignableFrom(c08)) {
                                                            ks4Var = new ks4(method, i10, R, paVar2.s(type, annotationArr3, annotationArr));
                                                            uj2Var2 = ks4Var;
                                                        } else {
                                                            throw ak7.v0(method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        uj2Var2 = fs4Var;
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof at4) {
                                                uk5Var.c(i10, type);
                                                if (uk5Var.q) {
                                                    uk5Var.g = true;
                                                    Class c09 = ak7.c0(type);
                                                    if (Map.class.isAssignableFrom(c09)) {
                                                        Type e04 = ak7.e0(type, c09);
                                                        if (e04 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) e04;
                                                            Type Y5 = ak7.Y(0, parameterizedType4);
                                                            if (String.class == Y5) {
                                                                Type Y6 = ak7.Y(1, parameterizedType4);
                                                                if (!k94.class.isAssignableFrom(ak7.c0(Y6))) {
                                                                    uj2Var2 = new ks4(method, i10, paVar2.s(Y6, annotationArr3, annotationArr), ((at4) annotation2).encoding());
                                                                } else {
                                                                    throw ak7.v0(method, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw ak7.v0(method, i10, "@PartMap keys must be of type String: " + Y5, new Object[0]);
                                                            }
                                                        } else {
                                                            throw ak7.v0(method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw ak7.v0(method, i10, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof o50) {
                                                uk5Var.c(i10, type);
                                                if (!uk5Var.p && !uk5Var.q) {
                                                    if (!uk5Var.h) {
                                                        try {
                                                            b51 s = paVar2.s(type, annotationArr3, annotationArr);
                                                            uk5Var.h = true;
                                                            uj2Var2 = new gs4(method, i10, s);
                                                        } catch (RuntimeException e2) {
                                                            throw ak7.w0(method, e2, i10, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else {
                                                        throw ak7.v0(method, i10, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                } else {
                                                    throw ak7.v0(method, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof ry6) {
                                                uk5Var.c(i10, type);
                                                Class a2 = uk5.a(ak7.c0(type));
                                                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                                                    uj2 uj2Var4 = uk5Var.v[i13];
                                                    if ((uj2Var4 instanceof os4) && ((os4) uj2Var4).h.equals(a2)) {
                                                        throw ak7.v0(method, i10, "@Tag type " + a2.getName() + " is duplicate of " + jx4.b.f(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                uj2Var2 = new os4(a2);
                                            } else {
                                                uj2Var2 = null;
                                            }
                                        }
                                        str = str3;
                                    }
                                    if (uj2Var2 != null) {
                                        if (uj2Var == null) {
                                            uj2Var = uj2Var2;
                                        } else {
                                            throw ak7.v0(method, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                    }
                                    i11 = i3 + 1;
                                    annotationArr2 = annotationArr4;
                                    i9 = i2;
                                    length3 = i12;
                                    i = i4;
                                    str3 = str;
                                    uj2VarArr2 = uj2VarArr;
                                    length4 = i5;
                                }
                            }
                            i3 = i11;
                            uj2VarArr = uj2VarArr2;
                            i4 = i;
                            i5 = length4;
                            if (uj2Var2 != null) {
                            }
                            i11 = i3 + 1;
                            annotationArr2 = annotationArr4;
                            i9 = i2;
                            length3 = i12;
                            i = i4;
                            str3 = str;
                            uj2VarArr2 = uj2VarArr;
                            length4 = i5;
                        }
                    } else {
                        uj2Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length3;
                    String str4 = str3;
                    int i15 = i9;
                    uj2[] uj2VarArr3 = uj2VarArr2;
                    int i16 = i;
                    if (uj2Var == null) {
                        if (i16 != 0) {
                            try {
                                if (ak7.c0(type) == r41.class) {
                                    uk5Var.w = true;
                                    uj2Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw ak7.v0(method, i10, "No Retrofit annotation found.", new Object[0]);
                    }
                    uj2VarArr3[i10] = uj2Var;
                    i10++;
                    annotationArr2 = annotationArr5;
                    i9 = i15;
                    length3 = i14;
                    str3 = str4;
                    i6 = 0;
                    uj2Var3 = null;
                }
                String str5 = str3;
                if (uk5Var.r == null && !uk5Var.m) {
                    throw ak7.o0(method, null, "Missing either @%s URL or @Url parameter.", uk5Var.n);
                }
                boolean z8 = uk5Var.p;
                if (!z8 && !uk5Var.q && !uk5Var.o && uk5Var.h) {
                    throw ak7.o0(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z8 && !uk5Var.f) {
                    throw ak7.o0(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (uk5Var.q && !uk5Var.g) {
                    throw ak7.o0(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                vk5 vk5Var = new vk5(uk5Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (!ak7.i0(genericReturnType2)) {
                    if (genericReturnType2 != Void.TYPE) {
                        Annotation[] annotations = method.getAnnotations();
                        boolean z9 = vk5Var.k;
                        if (z9) {
                            Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                            if (type2 instanceof WildcardType) {
                                type2 = ((WildcardType) type2).getLowerBounds()[0];
                            }
                            if (ak7.c0(type2) == vl5.class && (type2 instanceof ParameterizedType)) {
                                type2 = ak7.Y(0, (ParameterizedType) type2);
                                z2 = true;
                                z4 = false;
                            } else if (ak7.c0(type2) != gb0.class) {
                                if (ak7.i && type2 == jg7.class) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                z2 = false;
                            } else {
                                throw ak7.o0(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", ak7.Y(0, (ParameterizedType) type2));
                            }
                            genericReturnType = new vu2((Type) null, (Type) gb0.class, new Type[]{type2});
                            if (!ak7.l0(annotations, nj6.class)) {
                                Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                                annotationArr6[0] = oj6.a;
                                System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                                annotations = annotationArr6;
                            }
                            z = z4;
                        } else {
                            genericReturnType = method.getGenericReturnType();
                            z = false;
                            z2 = false;
                        }
                        try {
                            ib0 i17 = paVar.i(genericReturnType, annotations);
                            Type a3 = i17.a();
                            if (a3 != wl5.class) {
                                if (a3 != vl5.class) {
                                    if (vk5Var.c.equals(str5) && !Void.class.equals(a3) && (!ak7.i || a3 != jg7.class)) {
                                        throw ak7.o0(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                                    }
                                    try {
                                        b51 t = paVar.t(a3, method.getAnnotations());
                                        xk4 xk4Var = (xk4) paVar.L;
                                        if (!z9) {
                                            return new a03(vk5Var, xk4Var, t, i17, 0);
                                        }
                                        if (z2) {
                                            return new a03(vk5Var, xk4Var, t, i17, 1);
                                        }
                                        return new b03(vk5Var, xk4Var, t, i17, z);
                                    } catch (RuntimeException e3) {
                                        throw ak7.o0(method, e3, "Unable to create converter for %s", a3);
                                    }
                                }
                                throw ak7.o0(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                            }
                            throw ak7.o0(method, null, "'" + ak7.c0(a3).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                        } catch (RuntimeException e4) {
                            throw ak7.o0(method, e4, "Unable to create call adapter for %s", genericReturnType);
                        }
                    }
                    throw ak7.o0(method, null, "Service methods cannot return void.", new Object[0]);
                }
                throw ak7.o0(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
            } else {
                throw ak7.o0(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw ak7.o0(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object a(vk4 vk4Var, Object[] objArr);
}
