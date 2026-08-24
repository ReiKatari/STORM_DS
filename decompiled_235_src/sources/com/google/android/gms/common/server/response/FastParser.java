package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                int i = 0;
                while (i < read) {
                    char c = cArr[i];
                    if (!Character.isISOControl(c) || (cArr2 != null && cArr2[0] == c)) {
                        int i2 = i + 1;
                        if (c == '\"') {
                            if (!z) {
                                sb.append(cArr, 0, i);
                                bufferedReader.reset();
                                bufferedReader.skip(i2);
                                if (z2) {
                                    return JsonUtils.unescapeString(sb.toString());
                                }
                                return sb.toString();
                            }
                        } else if (c == '\\') {
                            z = !z;
                            z2 = true;
                            i = i2;
                        }
                        z = false;
                        i = i2;
                    }
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
        throw new ParseException("Unexpected control character while reading string");
    }

    private final char zai(BufferedReader bufferedReader) {
        char[] cArr;
        if (bufferedReader.read(this.zao) == -1) {
            return (char) 0;
        }
        do {
            boolean isWhitespace = Character.isWhitespace(this.zao[0]);
            cArr = this.zao;
            if (!isWhitespace) {
                return cArr[0];
            }
        } while (bufferedReader.read(cArr) != -1);
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return RecyclerView.B1;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) {
        int i;
        int i2;
        int i3;
        int i4;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c = cArr[0];
            if (c == '-') {
                i = Integer.MIN_VALUE;
            } else {
                i = -2147483647;
            }
            if (c == '-') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 < zam2) {
                i4 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i3 = 0;
                i4 = i2;
            }
            while (i4 < zam2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(cArr[i4], 10);
                if (digit2 >= 0) {
                    if (i3 >= -214748364) {
                        int i6 = i3 * 10;
                        if (i6 >= i + digit2) {
                            i3 = i6 - digit2;
                            i4 = i5;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i2 != 0) {
                if (i4 > 1) {
                    return i3;
                }
                throw new ParseException("No digits to parse");
            }
            return -i3;
        }
        throw new ParseException("No number to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (zai2 == '\"') {
                    i = 0;
                    boolean z = false;
                    while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                        char c = cArr[i];
                        if (!Character.isISOControl(c)) {
                            int i2 = i + 1;
                            if (c == '\"') {
                                if (!z) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i2);
                                    return i;
                                }
                            } else if (c == '\\') {
                                z = !z;
                                i = i2;
                            }
                            z = false;
                            i = i2;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = zai2;
                    i = 1;
                    while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                        char c2 = cArr[i];
                        if (c2 != '}' && c2 != ',' && !Character.isWhitespace(c2) && cArr[i] != ']') {
                            i++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i - 1);
                            cArr[i] = 0;
                            return i;
                        }
                    }
                }
                if (i == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) {
        long j;
        long j2;
        int i;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            int i2 = 0;
            char c = cArr[0];
            if (c == '-') {
                j = Long.MIN_VALUE;
            } else {
                j = -9223372036854775807L;
            }
            if (c == '-') {
                i2 = 1;
            }
            if (i2 < zam2) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j2 = 0;
                i = i2;
            }
            while (i < zam2) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 >= 0) {
                    if (j2 >= -922337203685477580L) {
                        long j3 = j2 * 10;
                        long j4 = digit2;
                        if (j3 >= j + j4) {
                            j2 = j3 - j4;
                            i = i3;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i2 != 0) {
                if (i > 1) {
                    return j2;
                }
                throw new ParseException("No digits to parse");
            }
            return -j2;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb, cArr2);
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != ']') {
                if (zai2 == '}') {
                    zaw(2);
                    return null;
                }
                e41.d(zai2, "Unexpected token: ");
                return null;
            }
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        this.zat.push(3);
        String zaA = zaA(bufferedReader, this.zap, this.zar, null);
        zaw(3);
        if (zai(bufferedReader) == ':') {
            return zaA;
        }
        throw new ParseException("Expected key/value separator");
    }

    private final String zar(BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i = 1;
        if (zai2 != '\"') {
            if (zai2 != ',') {
                if (zai2 != '[') {
                    if (zai2 != '{') {
                        bufferedReader.reset();
                        zam(bufferedReader, this.zaq);
                    } else {
                        this.zat.push(1);
                        bufferedReader.mark(32);
                        char zai3 = zai(bufferedReader);
                        if (zai3 == '}') {
                            zaw(1);
                        } else if (zai3 == '\"') {
                            bufferedReader.reset();
                            zaq(bufferedReader);
                            do {
                            } while (zar(bufferedReader) != null);
                            zaw(1);
                        } else {
                            e41.d(zai3, "Unexpected token ");
                            return null;
                        }
                    }
                } else {
                    this.zat.push(5);
                    bufferedReader.mark(32);
                    if (zai(bufferedReader) == ']') {
                        zaw(5);
                    } else {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i > 0) {
                            char zai4 = zai(bufferedReader);
                            if (zai4 != 0) {
                                if (!Character.isISOControl(zai4)) {
                                    if (zai4 == '\"') {
                                        if (!z2) {
                                            z = !z;
                                        }
                                        zai4 = '\"';
                                    }
                                    if (zai4 == '[') {
                                        if (!z) {
                                            i++;
                                        }
                                        zai4 = '[';
                                    }
                                    if (zai4 == ']' && !z) {
                                        i--;
                                    }
                                    if (zai4 == '\\' && z) {
                                        z2 = !z2;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    throw new ParseException("Unexpected control character while reading array");
                                }
                            } else {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                        }
                        zaw(5);
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader.read(this.zao) != -1) {
            char c = this.zao[0];
            boolean z3 = false;
            do {
                if (c == '\"') {
                    if (z3) {
                        z3 = true;
                        c = '\"';
                    }
                }
                if (c == '\\') {
                    z3 = !z3;
                } else {
                    z3 = false;
                }
                if (bufferedReader.read(this.zao) != -1) {
                    c = this.zao[0];
                } else {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zai5 = zai(bufferedReader);
        if (zai5 != ',') {
            if (zai5 == '}') {
                zaw(2);
                return null;
            }
            e41.d(zai5, "Unexpected token ");
            return null;
        }
        zaw(2);
        return zaq(bufferedReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        } else if (zai2 == '[') {
            this.zat.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char zai3 = zai(bufferedReader);
                if (zai3 != 0) {
                    if (zai3 != ',') {
                        if (zai3 != ']') {
                            bufferedReader.reset();
                            arrayList.add(zaiVar.zaa(this, bufferedReader));
                        } else {
                            zaw(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) {
        ArrayList arrayList = new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 != ']') {
            if (zai2 != 'n') {
                if (zai2 == '{') {
                    this.zat.push(1);
                    while (true) {
                        try {
                            FastJsonResponse zad2 = field.zad();
                            if (zaz(bufferedReader, zad2)) {
                                arrayList.add(zad2);
                                char zai3 = zai(bufferedReader);
                                if (zai3 != ',') {
                                    if (zai3 == ']') {
                                        zaw(5);
                                        return arrayList;
                                    }
                                    e41.d(zai3, "Unexpected token: ");
                                    return null;
                                } else if (zai(bufferedReader) == '{') {
                                    this.zat.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return arrayList;
                            }
                        } catch (IllegalAccessException e) {
                            throw new ParseException("Error instantiating inner object", e);
                        } catch (InstantiationException e2) {
                            throw new ParseException("Error instantiating inner object", e2);
                        }
                    }
                } else {
                    e41.d(zai2, "Unexpected token: ");
                    return null;
                }
            } else {
                zax(bufferedReader, zaa);
                zaw(5);
                return null;
            }
        } else {
            zaw(5);
            return arrayList;
        }
    }

    private final void zaw(int i) {
        if (!this.zat.isEmpty()) {
            int intValue = ((Integer) this.zat.pop()).intValue();
            if (intValue == i) {
                return;
            }
            throw new ParseException(lb1.j("Expected state ", i, intValue, " but had "));
        }
        throw new ParseException(lb1.k("Expected state ", i, " but had empty stack"));
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i < length) {
                int read = bufferedReader.read(this.zap, 0, length - i);
                if (read != -1) {
                    for (int i2 = 0; i2 < read; i2++) {
                        if (cArr[i2 + i] != this.zap[i2]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z) {
        char[] cArr;
        char[] cArr2;
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != 'f') {
                if (zai2 != 'n') {
                    if (zai2 == 't') {
                        if (z) {
                            cArr2 = zac;
                        } else {
                            cArr2 = zab;
                        }
                        zax(bufferedReader, cArr2);
                        return true;
                    }
                    e41.d(zai2, "Unexpected token: ");
                    return false;
                }
                zax(bufferedReader, zaa);
                return false;
            }
            if (z) {
                cArr = zae;
            } else {
                cArr = zad;
            }
            zax(bufferedReader, cArr);
            return false;
        } else if (!z) {
            return zay(bufferedReader, true);
        } else {
            throw new ParseException("No boolean value found in string");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) {
        int i;
        HashMap hashMap;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String zaq = zaq(bufferedReader);
        if (zaq != null) {
            while (zaq != null) {
                FastJsonResponse.Field<?, ?> field = fieldMappings.get(zaq);
                if (field == null) {
                    zaq = zar(bufferedReader);
                } else {
                    this.zat.push(4);
                    int i2 = field.zaa;
                    switch (i2) {
                        case 0:
                            if (field.zab) {
                                fastJsonResponse.zav(field, zau(bufferedReader, zag));
                            } else {
                                fastJsonResponse.zau(field, zal(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 1:
                            if (field.zab) {
                                fastJsonResponse.zag(field, zau(bufferedReader, zam));
                            } else {
                                fastJsonResponse.zae(field, zat(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 2:
                            if (field.zab) {
                                fastJsonResponse.zay(field, zau(bufferedReader, zah));
                            } else {
                                fastJsonResponse.zax(field, zan(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 3:
                            if (field.zab) {
                                fastJsonResponse.zas(field, zau(bufferedReader, zai));
                            } else {
                                fastJsonResponse.zaq(field, zak(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 4:
                            if (field.zab) {
                                fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                            } else {
                                fastJsonResponse.zam(field, zaj(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 5:
                            if (field.zab) {
                                fastJsonResponse.zac(field, zau(bufferedReader, zan));
                            } else {
                                fastJsonResponse.zaa(field, zas(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 6:
                            if (field.zab) {
                                fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                            } else {
                                fastJsonResponse.zai(field, zay(bufferedReader, false));
                            }
                            i = 4;
                            break;
                        case 7:
                            if (field.zab) {
                                fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                            } else {
                                fastJsonResponse.zaA(field, zao(bufferedReader));
                            }
                            i = 4;
                            break;
                        case 8:
                            fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                            i = 4;
                            break;
                        case 9:
                            fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                            i = 4;
                            break;
                        case 10:
                            char zai2 = zai(bufferedReader);
                            if (zai2 == 'n') {
                                zax(bufferedReader, zaa);
                                hashMap = null;
                            } else if (zai2 == '{') {
                                this.zat.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char zai3 = zai(bufferedReader);
                                    if (zai3 != 0) {
                                        if (zai3 != '\"') {
                                            if (zai3 == '}') {
                                                zaw(1);
                                            }
                                        } else {
                                            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
                                            if (zai(bufferedReader) == ':') {
                                                if (zai(bufferedReader) == '\"') {
                                                    hashMap.put(zaA, zaA(bufferedReader, this.zap, this.zar, null));
                                                    char zai4 = zai(bufferedReader);
                                                    if (zai4 != ',') {
                                                        if (zai4 == '}') {
                                                            zaw(1);
                                                        } else {
                                                            e41.d(zai4, "Unexpected character while parsing string map: ");
                                                            return false;
                                                        }
                                                    }
                                                } else {
                                                    throw new ParseException("Expected String value for key ".concat(String.valueOf(zaA)));
                                                }
                                            } else {
                                                throw new ParseException("No map value found for key ".concat(String.valueOf(zaA)));
                                            }
                                        }
                                    } else {
                                        throw new ParseException("Unexpected EOF");
                                    }
                                }
                            } else {
                                throw new ParseException("Expected start of a map object");
                            }
                            fastJsonResponse.zaB(field, hashMap);
                            i = 4;
                            break;
                        case 11:
                            if (field.zab) {
                                char zai5 = zai(bufferedReader);
                                if (zai5 == 'n') {
                                    zax(bufferedReader, zaa);
                                    fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                                } else {
                                    this.zat.push(5);
                                    if (zai5 == '[') {
                                        fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                                    } else {
                                        throw new ParseException("Expected array start");
                                    }
                                }
                            } else {
                                char zai6 = zai(bufferedReader);
                                if (zai6 == 'n') {
                                    zax(bufferedReader, zaa);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                                } else {
                                    this.zat.push(1);
                                    if (zai6 == '{') {
                                        try {
                                            FastJsonResponse zad2 = field.zad();
                                            zaz(bufferedReader, zad2);
                                            fastJsonResponse.addConcreteTypeInternal(field, field.zae, zad2);
                                        } catch (IllegalAccessException e) {
                                            throw new ParseException("Error instantiating inner object", e);
                                        } catch (InstantiationException e2) {
                                            throw new ParseException("Error instantiating inner object", e2);
                                        }
                                    } else {
                                        throw new ParseException("Expected start of object");
                                    }
                                }
                            }
                            i = 4;
                            break;
                        default:
                            throw new ParseException(lb1.g(i2, "Invalid field type "));
                    }
                    zaw(i);
                    zaw(2);
                    char zai7 = zai(bufferedReader);
                    if (zai7 != ',') {
                        if (zai7 == '}') {
                            zaq = null;
                        } else {
                            e41.d(zai7, "Expected end of object or field separator, but found: ");
                            return false;
                        }
                    } else {
                        zaq = zaq(bufferedReader);
                    }
                }
            }
            zaw(1);
            return true;
        }
        zaw(1);
        return false;
    }

    public void parse(InputStream inputStream, T t) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 != 0) {
                    if (zai2 != '[') {
                        if (zai2 == '{') {
                            this.zat.push(1);
                            zaz(bufferedReader, t);
                        } else {
                            throw new ParseException("Unexpected token: " + zai2);
                        }
                    } else {
                        this.zat.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    zaw(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class ParseException extends Exception {
        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(String str) {
            super(str);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }
}
