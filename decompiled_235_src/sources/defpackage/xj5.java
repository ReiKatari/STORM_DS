package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xj5 extends po2 implements qn2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj5(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.d0 = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Type inference failed for: r1v29, types: [zg5, java.lang.Object] */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i;
        pu0 pu0Var;
        og3 og3Var;
        c37 c37Var;
        boolean b;
        fp fpVar;
        fg7 fg7Var;
        Integer valueOf;
        int i2 = this.d0;
        jg7 jg7Var = jg7.a;
        int i3 = 0;
        r7 = false;
        r7 = false;
        r7 = false;
        boolean z = false;
        og3 og3Var2 = null;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                int intValue = ((Number) obj).intValue();
                ((yj5) obj2).getClass();
                long j = intValue;
                long j2 = 4294967295L & j;
                return Integer.valueOf(((int) (j & 255)) | (((int) ((j2 >>> 16) & 255)) << 16) | (-16777216) | (((int) ((j2 >>> 8) & 255)) << 8));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                ((yj5) obj2).getClass();
                int i4 = (((intValue2 >>> 24) & 63) * 255) / 63;
                if ((4194304 & intValue2) != 0) {
                    i = 255;
                } else {
                    i = 0;
                }
                if ((32768 & intValue2) != 0) {
                    i3 = 255;
                }
                return Integer.valueOf((i4 << 16) | (-16777216) | (i3 << 8) | Math.max(((intValue2 & 31) * 255) / 31, i));
            case 2:
                int intValue3 = ((Number) obj).intValue();
                ((yj5) obj2).getClass();
                int q = (gi2.q(intValue3 & 255, 0, 31) * 255) / 31;
                return Integer.valueOf(q | (q << 16) | (-16777216) | (q << 8));
            case 3:
                long j3 = ((jk4) obj).a;
                q07 q07Var = (q07) obj2;
                q07Var.getClass();
                u07 u07Var = (u07) hf.K(q07Var, v07.a);
                if (u07Var != null) {
                    hv.L(q07Var.F0(), null, null, new c0(q07Var, j3, u07Var, new p07(q07Var, j3), (r41) null), 3);
                }
                return jg7Var;
            case 4:
                ((j07) obj2).b.a((qn2) obj);
                return jg7Var;
            default:
                KeyEvent keyEvent = ((wg3) obj).a;
                v17 v17Var = (v17) obj2;
                j47 j47Var = v17Var.f;
                boolean z2 = v17Var.d;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    fc1 fc1Var = v17Var.i;
                    fc1Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        fc1Var.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = fc1Var.a;
                        if (num != null) {
                            fc1Var.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer valueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                unicodeChar = valueOf2.intValue();
                            }
                            valueOf = Integer.valueOf(unicodeChar);
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        pu0Var = new pu0(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (pu0Var == null) {
                            if (z2) {
                                v17Var.a(hf.b0(pu0Var));
                                j47Var.a = null;
                                z = true;
                            }
                        } else if (xk2.u(keyEvent) == 2) {
                            v17Var.j.getClass();
                            int G = kn2.G(keyEvent);
                            if (G == 9) {
                                long e = qo2.e(keyEvent.getKeyCode());
                                if (kg3.a(e, kg3.f)) {
                                    og3Var = og3.SELECT_LINE_LEFT;
                                } else if (kg3.a(e, kg3.g)) {
                                    og3Var = og3.SELECT_LINE_RIGHT;
                                } else if (kg3.a(e, kg3.d)) {
                                    og3Var = og3.SELECT_HOME;
                                } else {
                                    if (kg3.a(e, kg3.e)) {
                                        og3Var = og3.SELECT_END;
                                    }
                                    og3Var = null;
                                }
                                if (og3Var == null) {
                                    int G2 = kn2.G(keyEvent);
                                    long e2 = qo2.e(keyEvent.getKeyCode());
                                    if (kg3.a(e2, kg3.u)) {
                                        if (G2 == 0 || G2 == 8 || G2 == 12) {
                                            og3Var = og3.DELETE_PREV_CHAR;
                                        } else {
                                            if (G2 == 2 || G2 == 10) {
                                                og3Var = og3.DELETE_PREV_WORD;
                                            }
                                            og3Var = null;
                                        }
                                        if (og3Var == null) {
                                            int G3 = kn2.G(keyEvent);
                                            if (G3 == 10) {
                                                long e3 = qo2.e(keyEvent.getKeyCode());
                                                if (!kg3.a(e3, kg3.f) && !kg3.a(e3, kg3.Q)) {
                                                    if (!kg3.a(e3, kg3.g) && !kg3.a(e3, kg3.R)) {
                                                        if (!kg3.a(e3, kg3.d) && !kg3.a(e3, kg3.O)) {
                                                            if (kg3.a(e3, kg3.e) || kg3.a(e3, kg3.P)) {
                                                                og3Var = og3.SELECT_NEXT_PARAGRAPH;
                                                            }
                                                            og3Var = null;
                                                        } else {
                                                            og3Var = og3.SELECT_PREV_PARAGRAPH;
                                                        }
                                                    } else {
                                                        og3Var = og3.SELECT_RIGHT_WORD;
                                                    }
                                                } else {
                                                    og3Var = og3.SELECT_LEFT_WORD;
                                                }
                                                if (og3Var == null) {
                                                    Object obj3 = dh3.a.B;
                                                    int G4 = kn2.G(keyEvent);
                                                    if (G4 == 10) {
                                                        if (kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.q)) {
                                                            og3Var2 = og3.REDO;
                                                        }
                                                    } else if (G4 == 2) {
                                                        long e4 = qo2.e(keyEvent.getKeyCode());
                                                        if (!kg3.a(e4, kg3.l) && !kg3.a(e4, kg3.z) && !kg3.a(e4, kg3.W)) {
                                                            if (kg3.a(e4, kg3.n)) {
                                                                og3Var2 = og3.PASTE;
                                                            } else if (kg3.a(e4, kg3.o)) {
                                                                og3Var2 = og3.CUT;
                                                            } else if (kg3.a(e4, kg3.k)) {
                                                                og3Var2 = og3.SELECT_ALL;
                                                            } else if (kg3.a(e4, kg3.p)) {
                                                                og3Var2 = og3.REDO;
                                                            } else if (kg3.a(e4, kg3.q)) {
                                                                og3Var2 = og3.UNDO;
                                                            }
                                                        } else {
                                                            og3Var2 = og3.COPY;
                                                        }
                                                    } else if (G4 == 8) {
                                                        long e5 = qo2.e(keyEvent.getKeyCode());
                                                        if (!kg3.a(e5, kg3.f) && !kg3.a(e5, kg3.Q)) {
                                                            if (!kg3.a(e5, kg3.g) && !kg3.a(e5, kg3.R)) {
                                                                if (!kg3.a(e5, kg3.d) && !kg3.a(e5, kg3.O)) {
                                                                    if (!kg3.a(e5, kg3.e) && !kg3.a(e5, kg3.P)) {
                                                                        if (!kg3.a(e5, kg3.F) && !kg3.a(e5, kg3.U)) {
                                                                            if (!kg3.a(e5, kg3.G) && !kg3.a(e5, kg3.V)) {
                                                                                if (!kg3.a(e5, kg3.x) && !kg3.a(e5, kg3.S)) {
                                                                                    if (!kg3.a(e5, kg3.y) && !kg3.a(e5, kg3.T)) {
                                                                                        if (kg3.a(e5, kg3.z) || kg3.a(e5, kg3.W)) {
                                                                                            og3Var2 = og3.PASTE;
                                                                                        }
                                                                                    } else {
                                                                                        og3Var2 = og3.SELECT_LINE_END;
                                                                                    }
                                                                                } else {
                                                                                    og3Var2 = og3.SELECT_LINE_START;
                                                                                }
                                                                            } else {
                                                                                og3Var2 = og3.SELECT_PAGE_DOWN;
                                                                            }
                                                                        } else {
                                                                            og3Var2 = og3.SELECT_PAGE_UP;
                                                                        }
                                                                    } else {
                                                                        og3Var2 = og3.SELECT_DOWN;
                                                                    }
                                                                } else {
                                                                    og3Var2 = og3.SELECT_UP;
                                                                }
                                                            } else {
                                                                og3Var2 = og3.SELECT_RIGHT_CHAR;
                                                            }
                                                        } else {
                                                            og3Var2 = og3.SELECT_LEFT_CHAR;
                                                        }
                                                    } else if (G4 == 0) {
                                                        long e6 = qo2.e(keyEvent.getKeyCode());
                                                        if (!kg3.a(e6, kg3.f) && !kg3.a(e6, kg3.Q)) {
                                                            if (!kg3.a(e6, kg3.g) && !kg3.a(e6, kg3.R)) {
                                                                if (!kg3.a(e6, kg3.d) && !kg3.a(e6, kg3.O)) {
                                                                    if (!kg3.a(e6, kg3.e) && !kg3.a(e6, kg3.P)) {
                                                                        if (kg3.a(e6, kg3.h)) {
                                                                            og3Var2 = og3.CENTER;
                                                                        } else if (!kg3.a(e6, kg3.F) && !kg3.a(e6, kg3.U)) {
                                                                            if (!kg3.a(e6, kg3.G) && !kg3.a(e6, kg3.V)) {
                                                                                if (!kg3.a(e6, kg3.x) && !kg3.a(e6, kg3.S)) {
                                                                                    if (!kg3.a(e6, kg3.y) && !kg3.a(e6, kg3.T)) {
                                                                                        if (!kg3.a(e6, kg3.t) && !kg3.a(e6, kg3.N)) {
                                                                                            if (kg3.a(e6, kg3.u)) {
                                                                                                og3Var2 = og3.DELETE_PREV_CHAR;
                                                                                            } else if (kg3.a(e6, kg3.v)) {
                                                                                                og3Var2 = og3.DELETE_NEXT_CHAR;
                                                                                            } else if (kg3.a(e6, kg3.C)) {
                                                                                                og3Var2 = og3.PASTE;
                                                                                            } else if (kg3.a(e6, kg3.A)) {
                                                                                                og3Var2 = og3.CUT;
                                                                                            } else if (kg3.a(e6, kg3.B)) {
                                                                                                og3Var2 = og3.COPY;
                                                                                            } else if (kg3.a(e6, kg3.r)) {
                                                                                                og3Var2 = og3.TAB;
                                                                                            }
                                                                                        } else {
                                                                                            og3Var2 = og3.NEW_LINE;
                                                                                        }
                                                                                    } else {
                                                                                        og3Var2 = og3.LINE_END;
                                                                                    }
                                                                                } else {
                                                                                    og3Var2 = og3.LINE_START;
                                                                                }
                                                                            } else {
                                                                                og3Var2 = og3.PAGE_DOWN;
                                                                            }
                                                                        } else {
                                                                            og3Var2 = og3.PAGE_UP;
                                                                        }
                                                                    } else {
                                                                        og3Var2 = og3.DOWN;
                                                                    }
                                                                } else {
                                                                    og3Var2 = og3.UP;
                                                                }
                                                            } else {
                                                                og3Var2 = og3.RIGHT_CHAR;
                                                            }
                                                        } else {
                                                            og3Var2 = og3.LEFT_CHAR;
                                                        }
                                                    }
                                                    og3Var = og3Var2;
                                                }
                                            } else if (G3 == 2) {
                                                long e7 = qo2.e(keyEvent.getKeyCode());
                                                if (!kg3.a(e7, kg3.f) && !kg3.a(e7, kg3.Q)) {
                                                    if (!kg3.a(e7, kg3.g) && !kg3.a(e7, kg3.R)) {
                                                        if (!kg3.a(e7, kg3.d) && !kg3.a(e7, kg3.O)) {
                                                            if (!kg3.a(e7, kg3.e) && !kg3.a(e7, kg3.P)) {
                                                                if (kg3.a(e7, kg3.m)) {
                                                                    og3Var = og3.DELETE_PREV_CHAR;
                                                                } else if (kg3.a(e7, kg3.v)) {
                                                                    og3Var = og3.DELETE_NEXT_WORD;
                                                                } else {
                                                                    if (kg3.a(e7, kg3.D)) {
                                                                        og3Var = og3.DESELECT;
                                                                    }
                                                                    og3Var = null;
                                                                }
                                                            } else {
                                                                og3Var = og3.NEXT_PARAGRAPH;
                                                            }
                                                        } else {
                                                            og3Var = og3.PREV_PARAGRAPH;
                                                        }
                                                    } else {
                                                        og3Var = og3.RIGHT_WORD;
                                                    }
                                                } else {
                                                    og3Var = og3.LEFT_WORD;
                                                }
                                                if (og3Var == null) {
                                                }
                                            } else if (G3 == 8) {
                                                long e8 = qo2.e(keyEvent.getKeyCode());
                                                if (!kg3.a(e8, kg3.x) && !kg3.a(e8, kg3.S)) {
                                                    if (kg3.a(e8, kg3.y) || kg3.a(e8, kg3.T)) {
                                                        og3Var = og3.SELECT_LINE_END;
                                                    }
                                                    og3Var = null;
                                                } else {
                                                    og3Var = og3.SELECT_LINE_START;
                                                }
                                                if (og3Var == null) {
                                                }
                                            } else {
                                                if (G3 == 1 && kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.v)) {
                                                    og3Var = og3.DELETE_TO_LINE_END;
                                                    if (og3Var == null) {
                                                    }
                                                }
                                                og3Var = null;
                                                if (og3Var == null) {
                                                }
                                            }
                                        }
                                    } else {
                                        if ((kg3.a(e2, kg3.t) || kg3.a(e2, kg3.N)) && (G2 == 0 || G2 == 8 || G2 == 2 || G2 == 10)) {
                                            og3Var = og3.NEW_LINE;
                                            if (og3Var == null) {
                                            }
                                        }
                                        og3Var = null;
                                        if (og3Var == null) {
                                        }
                                    }
                                }
                                if (og3Var != null && (!og3Var.getEditsText() || z2)) {
                                    ?? obj4 = new Object();
                                    obj4.A = true;
                                    t00 t00Var = new t00(og3Var, v17Var, (Object) obj4, 29);
                                    c37Var = v17Var.c;
                                    b27 b27Var = new b27(c37Var, v17Var.g, v17Var.a.d(), j47Var);
                                    t00Var.g(b27Var);
                                    b = k47.b(b27Var.f, c37Var.b);
                                    fpVar = b27Var.g;
                                    if (b || !nb3.k(fpVar, c37Var.a)) {
                                        v17Var.k.g(c37.a(c37Var, fpVar, b27Var.f, 4));
                                    }
                                    fg7Var = v17Var.h;
                                    if (fg7Var != null) {
                                        fg7Var.e = true;
                                    }
                                    z = obj4.A;
                                }
                            } else {
                                if (G == 1) {
                                    long e9 = qo2.e(keyEvent.getKeyCode());
                                    if (kg3.a(e9, kg3.f)) {
                                        og3Var = og3.LINE_LEFT;
                                    } else if (kg3.a(e9, kg3.g)) {
                                        og3Var = og3.LINE_RIGHT;
                                    } else if (kg3.a(e9, kg3.d)) {
                                        og3Var = og3.HOME;
                                    } else if (kg3.a(e9, kg3.e)) {
                                        og3Var = og3.END;
                                    } else if (kg3.a(e9, kg3.u)) {
                                        og3Var = og3.DELETE_FROM_LINE_START;
                                    }
                                    if (og3Var == null) {
                                    }
                                    if (og3Var != null) {
                                        ?? obj42 = new Object();
                                        obj42.A = true;
                                        t00 t00Var2 = new t00(og3Var, v17Var, (Object) obj42, 29);
                                        c37Var = v17Var.c;
                                        b27 b27Var2 = new b27(c37Var, v17Var.g, v17Var.a.d(), j47Var);
                                        t00Var2.g(b27Var2);
                                        b = k47.b(b27Var2.f, c37Var.b);
                                        fpVar = b27Var2.g;
                                        if (b) {
                                        }
                                        v17Var.k.g(c37.a(c37Var, fpVar, b27Var2.f, 4));
                                        fg7Var = v17Var.h;
                                        if (fg7Var != null) {
                                        }
                                        z = obj42.A;
                                    }
                                }
                                og3Var = null;
                                if (og3Var == null) {
                                }
                                if (og3Var != null) {
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                pu0Var = null;
                if (pu0Var == null) {
                }
                return Boolean.valueOf(z);
        }
    }
}
